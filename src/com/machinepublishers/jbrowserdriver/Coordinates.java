/* 
 * jBrowserDriver (TM)
 * Copyright (C) 2014-2015 Machine Publishers, LLC
 * ops@machinepublishers.com | machinepublishers.com
 * Cincinnati, Ohio, USA
 *
 * You can redistribute this program and/or modify it under the terms of the GNU Affero General Public
 * License version 3 as published by the Free Software Foundation.
 *
 * "jBrowserDriver" and "Machine Publishers" are trademarks of Machine Publishers, LLC.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Affero General Public License version 3 for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License version 3 along with this
 * program. If not, see http://www.gnu.org/licenses/
 * 
 * For general details about how to investigate and report license violations, please see
 * https://www.gnu.org/licenses/gpl-violation.html and email the author, ops@machinepublishers.com
 */
package com.machinepublishers.jbrowserdriver;

import java.rmi.RemoteException;

class Coordinates implements org.openqa.selenium.interactions.internal.Coordinates {
  final CoordinatesRemote remote;

  Coordinates(CoordinatesRemote remote) {
    this.remote = remote;
  }

  @Override
  public Point onScreen() {
    try {
      return remote.onScreen();
    } catch (RemoteException e) {
      // TODO 
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public Point inViewPort() {
    try {
      return remote.inViewPort();
    } catch (RemoteException e) {
      // TODO 
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public Point onPage() {
    try {
      return remote.onPage();
    } catch (RemoteException e) {
      // TODO
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public Object getAuxiliary() {
    try {
      return remote.getAuxiliary();
    } catch (RemoteException e) {
      // TODO 
      e.printStackTrace();
      return null;
    }
  }

}
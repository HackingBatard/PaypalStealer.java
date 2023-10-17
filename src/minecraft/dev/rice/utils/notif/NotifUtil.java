package dev.rice.utils.notif;

import dev.rice.client.Rice;
import dev.rice.notification.Notification;
import dev.rice.notification.Notification.Type;
import dev.rice.notification.NotificationManager;
import lombok.experimental.UtilityClass;

@UtilityClass
public class NotifUtil {
	
	public Notification info(String title, String message) {
		return new Notification(title, message, System.currentTimeMillis(), Type.INFO);
	}
	
	public Notification warn(String title, String message) {
		return new Notification(title, message, System.currentTimeMillis(), Type.WARNING);
	}
	
	public Notification error(String title, String message) {
		return new Notification(title, message, System.currentTimeMillis(), Type.ERROR);
	}
	
}

package com.instagram.debug.devoptions.debughead.data.provider;

import X.AbstractC167007dF;
import android.os.Handler;
import com.instagram.debug.devoptions.debughead.data.delegates.TasksEventDelegate;

/* loaded from: classes12.dex */
public class TasksHelper {
    public static final TasksHelper INSTANCE = new TasksHelper();
    public TasksEventDelegate mDelegate;
    public final Handler mHandler = AbstractC167007dF.A0J();

    public void updateQueueSize(final int i) {
        final TasksEventDelegate tasksEventDelegate = this.mDelegate;
        if (tasksEventDelegate != null) {
            this.mHandler.post(new Runnable() { // from class: com.instagram.debug.devoptions.debughead.data.provider.TasksHelper.1
                @Override // java.lang.Runnable
                public void run() {
                    tasksEventDelegate.onTasksQueueSizeUpdated(i);
                }
            });
        }
    }

    public static TasksHelper getInstance() {
        return INSTANCE;
    }

    public void setDelegate(TasksEventDelegate tasksEventDelegate) {
        this.mDelegate = tasksEventDelegate;
    }
}

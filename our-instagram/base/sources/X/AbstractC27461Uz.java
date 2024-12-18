package X;

import android.app.Activity;
import android.app.Application;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.1Uz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC27461Uz {
    public static Application A00;
    public static AbstractC27461Uz A01;

    public abstract boolean getShouldShowSmartLockForLogin();

    public abstract void getSmartLockBroker(FragmentActivity fragmentActivity, InterfaceC65457TkT interfaceC65457TkT, AbstractC12990ll abstractC12990ll);

    public abstract void getSmartLockBroker(FragmentActivity fragmentActivity, InterfaceC65457TkT interfaceC65457TkT, AbstractC12990ll abstractC12990ll, boolean z);

    public abstract InterfaceC37102GWm listenForSmsResponse(Activity activity, boolean z);

    public abstract void setShouldShowSmartLockForLogin(boolean z);

    public static synchronized AbstractC27461Uz getInstance() {
        AbstractC27461Uz abstractC27461Uz;
        synchronized (AbstractC27461Uz.class) {
            abstractC27461Uz = A01;
            if (abstractC27461Uz == null) {
                try {
                    abstractC27461Uz = (AbstractC27461Uz) Class.forName("com.instagram.login.smartlock.impl.SmartLockPluginImpl").getConstructor(new Class[0]).newInstance(new Object[0]);
                    A01 = abstractC27461Uz;
                } catch (Throwable unused) {
                    return null;
                }
            }
        }
        return abstractC27461Uz;
    }

    public static C121275eQ getInstanceAsync() {
        return new C121275eQ(new CallableC31711DwG(), 480);
    }

    public static void setApplication(Application application) {
        A00 = application;
    }
}

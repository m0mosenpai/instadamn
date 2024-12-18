package X;

import android.app.Application;
import android.content.Context;
import com.facebook.R;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.14C, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C14C extends AbstractC211911v {
    public final Context A00;
    public final C211211o A01;

    @Override // X.AbstractC211911v
    public final String A06() {
        return "PushNotificationInitializer";
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, X.2Sn] */
    @Override // X.AbstractC211911v
    public void A07() {
        final AbstractC12990ll A08 = ((AnonymousClass122) this.A01.A00()).A08();
        final Context context = this.A00;
        final ?? obj = new Object();
        C14360o3.A0B(context, 0);
        C50232Sp c50232Sp = new C50232Sp(context, A08, AbstractC09440dt.A01(new J7Q(new InterfaceC08830cm() { // from class: X.2So
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                return new C2S5(context.getApplicationContext());
            }
        }, 43)));
        C13080lu A00 = AbstractC13090lv.A00("FCMModule.initialize");
        try {
            final Context applicationContext = context.getApplicationContext();
            C2Sr.A03 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.2Sq
                @Override // X.InterfaceC16820sZ
                public final /* bridge */ /* synthetic */ Object invoke() {
                    Context context2 = applicationContext;
                    String string = context2.getString(R.string.google_app_id);
                    C3U5.A06(string, "ApplicationId must be set.");
                    String string2 = context2.getString(R.string.google_api_key);
                    C3U5.A06(string2, "ApiKey must be set.");
                    return new SPG(string, string2, context2.getString(R.string.firebase_database_url), context2.getString(R.string.gcm_defaultSenderId), context2.getString(R.string.project_id));
                }
            });
            C2Sr.A02 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.2Su
                @Override // X.InterfaceC16820sZ
                public final /* bridge */ /* synthetic */ Object invoke() {
                    InterfaceC09390do interfaceC09390do;
                    C63342Shx c63342Shx;
                    Context context2 = applicationContext;
                    synchronized (C2Sr.class) {
                        C2Sr.A00();
                        interfaceC09390do = C2Sr.A03;
                    }
                    SPG spg = (SPG) interfaceC09390do.getValue();
                    if (context2.getApplicationContext() instanceof Application) {
                        Application application = (Application) context2.getApplicationContext();
                        AtomicReference atomicReference = C58610Pyd.A00;
                        if (atomicReference.get() == null) {
                            Object obj2 = new Object();
                            if (C1EM.A00(null, obj2, atomicReference)) {
                                BackgroundDetector.A00(application);
                                BackgroundDetector backgroundDetector = BackgroundDetector.A04;
                                synchronized (backgroundDetector) {
                                    backgroundDetector.A01.add(obj2);
                                }
                            }
                        }
                    }
                    String trim = "[DEFAULT]".trim();
                    if (context2.getApplicationContext() != null) {
                        context2 = context2.getApplicationContext();
                    }
                    synchronized (C63342Shx.A09) {
                        Map map = C63342Shx.A0A;
                        boolean z = false;
                        if (!map.containsKey(trim)) {
                            z = true;
                        }
                        C3U5.A09(z, AnonymousClass001.A0g("FirebaseApp name ", trim, " already exists!"));
                        C3U5.A03(context2, "Application context cannot be null.");
                        c63342Shx = new C63342Shx(context2, spg, trim);
                        map.put(trim, c63342Shx);
                    }
                    C63342Shx.A02(c63342Shx);
                    return c63342Shx;
                }
            });
            C2Sr.A00 = c50232Sp;
            synchronized (C2Sr.class) {
                Object obj2 = C2Sr.A01;
                if (obj2 != null) {
                    C2Sr.A01 = null;
                    synchronized (obj2) {
                        obj2.notifyAll();
                    }
                }
            }
            A00.close();
            boolean z = C11P.A00;
            C11P.A00(new C1KC() { // from class: X.2Sv
                {
                    super("initPushRegistrar");
                }

                /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
                
                    if (X.C1C0.A00((com.instagram.common.session.UserSession) r1) == false) goto L6;
                 */
                @Override // X.C1KC
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean onQueueIdle() {
                    /*
                        r4 = this;
                        X.0ll r1 = X.AbstractC12990ll.this
                        java.lang.String r3 = X.AbstractC03270Dk.A02(r1)
                        boolean r0 = r1 instanceof com.instagram.common.session.UserSession
                        if (r0 == 0) goto L13
                        com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
                        boolean r0 = X.C1C0.A00(r1)
                        r2 = 1
                        if (r0 != 0) goto L14
                    L13:
                        r2 = 0
                    L14:
                        X.3UN r1 = X.C74063Tx.A00()
                        X.1WZ r0 = X.C3JG.A00
                        r1.CNt(r0, r3, r2)
                        r0 = 0
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C50272Sv.onQueueIdle():boolean");
                }
            });
            AbstractC24641Ih.A02.Ep8(new AbstractC18280vF() { // from class: X.2Sw
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super("pushNotificationInitializer", 1103141398);
                }

                @Override // X.AbstractC18280vF
                public final void loggedRun() {
                    C14C c14c = C14C.this;
                    C92I.A09(c14c.A00, A08);
                }
            });
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    public C14C(Context context, C211211o c211211o) {
        this.A00 = context;
        this.A01 = c211211o;
    }
}

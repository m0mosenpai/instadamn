package X;

import android.content.Context;

/* renamed from: X.1RT, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1RT {
    public final Context A00;
    public final C10050gI A01;
    public final C26791Rl A02;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.1Rl, java.lang.Object] */
    public C1RT(Context context, AbstractC12990ll abstractC12990ll) {
        this.A00 = context;
        this.A01 = C26711Ra.A00(context).A03;
        ?? obj = new Object();
        obj.A00 = abstractC12990ll;
        this.A02 = obj;
    }

    public static C1RU A00(Context context, final AbstractC12990ll abstractC12990ll) {
        final Context applicationContext = context.getApplicationContext();
        C1RU c1ru = (C1RU) abstractC12990ll.A01(C1RU.class, new InterfaceC16820sZ() { // from class: X.1RY
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                Context context2 = applicationContext;
                final AbstractC12990ll abstractC12990ll2 = abstractC12990ll;
                C19490xZ c19490xZ = C26711Ra.A00(context2).A00;
                final Context applicationContext2 = context2.getApplicationContext();
                return new C1RU(context2, c19490xZ, C26711Ra.A00(context2).A01, C26711Ra.A00(context2).A02, (C1RT) abstractC12990ll2.A01(C1RT.class, new InterfaceC16820sZ() { // from class: X.1Rk
                    @Override // X.InterfaceC16820sZ
                    public final Object invoke() {
                        return new C1RT(applicationContext2, abstractC12990ll2);
                    }
                }), new ExecutorC14040nU(C14120nc.A00(), 145, 3, false, false));
            }
        });
        if (applicationContext.getPackageManager() != null && C1Rm.A02(context, applicationContext.getPackageManager())) {
            c1ru.A00 = C1TY.A00(context);
        }
        return c1ru;
    }

    public C1RT() {
    }
}

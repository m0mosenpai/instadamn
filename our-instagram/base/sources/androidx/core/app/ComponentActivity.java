package androidx.core.app;

import X.AbstractC210211d;
import X.AnonymousClass023;
import X.C005001p;
import X.C07S;
import X.C07T;
import X.C07X;
import X.C0eR;
import X.C0f9;
import X.C0fM;
import X.C14360o3;
import X.InterfaceC008502z;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import kotlin.Deprecated;

/* loaded from: classes.dex */
public abstract class ComponentActivity extends Activity implements C07X, InterfaceC008502z {
    public final C005001p extraDataMap = new C005001p(0);
    public final C0eR lifecycleRegistry = new C0eR(this, true);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x000d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0045 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean shouldSkipDump(java.lang.String[] r5) {
        /*
            r4 = this;
            r3 = 1
            r2 = 0
            if (r5 == 0) goto L10
            int r0 = r5.length
            if (r0 == 0) goto L10
            r1 = r5[r2]
            int r0 = r1.hashCode()
            switch(r0) {
                case -645125871: goto L37;
                case 100470631: goto L2a;
                case 472614934: goto L27;
                case 1159329357: goto L11;
                case 1455016274: goto L1e;
                default: goto L10;
            }
        L10:
            return r2
        L11:
            java.lang.String r0 = "--contentcapture"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L10
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            goto L43
        L1e:
            java.lang.String r0 = "--autofill"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L46
            return r2
        L27:
            java.lang.String r0 = "--list-dumpables"
            goto L2c
        L2a:
            java.lang.String r0 = "--dump-dumpable"
        L2c:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L10
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            goto L43
        L37:
            java.lang.String r0 = "--translation"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L10
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
        L43:
            if (r1 >= r0) goto L46
            r3 = 0
        L46:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.ComponentActivity.shouldSkipDump(java.lang.String[]):boolean");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C14360o3.A0B(keyEvent, 0);
        C14360o3.A07(getWindow().getDecorView());
        return superDispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        C14360o3.A0B(keyEvent, 0);
        C14360o3.A07(getWindow().getDecorView());
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Deprecated(message = "Use {@link View#getTag(int)} with the window's decor view.")
    public AnonymousClass023 getExtraData(Class cls) {
        C14360o3.A0B(cls, 0);
        this.extraDataMap.get(cls);
        return null;
    }

    public abstract C07T getLifecycle();

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        this.lifecycleRegistry.A0C(C07S.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @Deprecated(message = "Use {@link View#setTag(int, Object)} with the window's decor view.")
    public void putExtraData(AnonymousClass023 anonymousClass023) {
        C14360o3.A0B(anonymousClass023, 0);
        this.extraDataMap.put(anonymousClass023.getClass(), anonymousClass023);
    }

    @Override // X.InterfaceC008502z
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        C14360o3.A0B(keyEvent, 0);
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(-1405646941);
        C0fM.A00(this);
        super.onCreate(bundle);
        AbstractC210211d.A00(this);
        C0f9.A07(355915110, A00);
    }

    public final boolean shouldDumpInternalState(String[] strArr) {
        return !shouldSkipDump(strArr);
    }
}

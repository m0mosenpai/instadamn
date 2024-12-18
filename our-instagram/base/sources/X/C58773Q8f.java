package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashSet;

/* renamed from: X.Q8f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58773Q8f extends AbstractC52922bZ {
    public static final java.util.Set A0B;
    public Bundle A00;
    public C63152Se0 A01;
    public C63152Se0 A02;
    public String A03;
    public final Context A04;
    public final C58252li A05;
    public final C58252li A06 = AbstractC58318PtA.A0I();
    public final C58252li A07;
    public final C2GS A08;
    public final C2GS A09;
    public final C62962SZf A0A;

    public static boolean A00(C58773Q8f c58773Q8f) {
        if (!"CONFIRM_PIN".equalsIgnoreCase(AbstractC63243Sfx.A01(c58773Q8f.A00, 1)) && !"CONFIRM_PIN".equalsIgnoreCase(AbstractC63243Sfx.A01(c58773Q8f.A00, 2))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, X.RpU] */
    public final void A02(Bundle bundle, C63152Se0 c63152Se0) {
        this.A00 = bundle;
        this.A02 = c63152Se0;
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("BUNDLE_KEY_PAYMENT_TYPE", AbstractC31173DnH.A0j(this.A00, "PAYMENT_TYPE"));
        String A00 = AbstractC63243Sfx.A00(this.A00, 1);
        A00.getClass();
        A0b.putString("BUNDLE_KEY_PRIMARY_FLOW_TYPE", A00);
        String A01 = AbstractC63243Sfx.A01(this.A00, 1);
        A01.getClass();
        A0b.putString("BUNDLE_KEY_PRIMARY_FLOW_STEP_TYPE", A01);
        if (!TextUtils.isEmpty(AbstractC63243Sfx.A00(this.A00, 2)) && !TextUtils.isEmpty(AbstractC63243Sfx.A01(this.A00, 2))) {
            A0b.putString("BUNDLE_KEY_SECONDARY_FLOW_TYPE", AbstractC63243Sfx.A00(this.A00, 2));
            A0b.putString("BUNDLE_KEY_SECONDARY_FLOW_STEP_TYPE", AbstractC63243Sfx.A01(this.A00, 2));
        }
        C2GS c2gs = this.A08;
        if (!TextUtils.isEmpty(A0b.getString("BUNDLE_KEY_PAYMENT_TYPE")) && !TextUtils.isEmpty(A0b.getString("BUNDLE_KEY_PRIMARY_FLOW_TYPE"))) {
            ?? obj = new Object();
            obj.A00 = A0b;
            c2gs.A0B(obj);
            return;
        }
        throw AbstractC166987dD.A12("The payment type and the primary flow type should not be null.");
    }

    public final void A03(String str) {
        this.A03 = str;
        this.A07.A0A(null);
        if (!A04() && !TextUtils.isEmpty(str) && str.length() == 4) {
            A01();
        }
    }

    public final boolean A04() {
        if (!"RECOVER_PIN".equalsIgnoreCase(AbstractC63243Sfx.A01(this.A00, 2)) && !"RECOVER_PIN".equalsIgnoreCase(AbstractC63243Sfx.A01(this.A00, 1))) {
            return false;
        }
        return true;
    }

    public final boolean A05() {
        if (TextUtils.isEmpty(AbstractC63243Sfx.A01(this.A00, 2))) {
            String A01 = AbstractC63243Sfx.A01(this.A00, 1);
            A01.getClass();
            if ("VERIFY_PIN".equalsIgnoreCase(A01)) {
                return true;
            }
        }
        return false;
    }

    static {
        HashSet A1H = AbstractC166987dD.A1H();
        A1H.add("CREATE_PIN");
        A1H.add("CONFIRM_PIN");
        A1H.add("VERIFY_PIN");
        A0B = A1H;
    }

    public C58773Q8f(Context context, C62962SZf c62962SZf) {
        C58252li A0I = AbstractC58318PtA.A0I();
        this.A07 = A0I;
        C58252li A0I2 = AbstractC58318PtA.A0I();
        this.A05 = A0I2;
        this.A08 = AbstractC58318PtA.A0J();
        C2GS A0J = AbstractC58318PtA.A0J();
        this.A09 = A0J;
        this.A0A = c62962SZf;
        this.A04 = context;
        C58252li A02 = C75M.A02(A0J, new TW3(this, 6));
        C63628Sqa.A03(A02, A0I2, this, 46);
        A02.A09(new C63625SqX(A02, C63628Sqa.A00(this, 47), 18));
        C63628Sqa.A03(A02, A0I, this, 48);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00f5 A[Catch: IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException -> 0x013a, TryCatch #0 {IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException -> 0x013a, blocks: (B:17:0x00b6, B:19:0x00f5, B:20:0x00fd, B:23:0x0111, B:24:0x0117, B:28:0x0103), top: B:16:0x00b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0103 A[Catch: IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException -> 0x013a, TryCatch #0 {IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException -> 0x013a, blocks: (B:17:0x00b6, B:19:0x00f5, B:20:0x00fd, B:23:0x0111, B:24:0x0117, B:28:0x0103), top: B:16:0x00b6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01() {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58773Q8f.A01():void");
    }
}

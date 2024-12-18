package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.mediastreaming.core.MSLogHandlerImpl;
import java.util.Arrays;

/* renamed from: X.Oei, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55219Oei {
    public static MSLogHandlerImpl A00;
    public static final C55219Oei A01 = new Object();

    public static final String A00(String str, Throwable th, Object... objArr) {
        StringBuilder sb = new StringBuilder(StringFormatUtil.formatStrLocaleSafe(str, Arrays.copyOf(objArr, objArr.length)));
        if (th != null) {
            sb.append(StringFormatUtil.formatStrLocaleSafe(" %s: %s", th.getMessage(), android.util.Log.getStackTraceString(th)));
        }
        return AbstractC166987dD.A19(sb);
    }

    public static final void A01(String str, String str2, Throwable th, Object... objArr) {
        C14360o3.A0B(objArr, 3);
        int length = objArr.length;
        Object[] copyOf = Arrays.copyOf(objArr, length);
        if (th == null) {
            C0K8.A0O(str, str2, copyOf);
        } else {
            C0K8.A0L(str, str2, th, copyOf);
        }
        A01.A09();
        MSLogHandlerImpl.logNative(1, str, A00(str2, th, Arrays.copyOf(objArr, length)));
    }

    public static final void A02(String str, String str2, Throwable th, Object... objArr) {
        C14360o3.A0B(objArr, 3);
        int length = objArr.length;
        Object[] copyOf = Arrays.copyOf(objArr, length);
        if (th == null) {
            C0K8.A0P(str, str2, copyOf);
        } else {
            C0K8.A0M(str, str2, th, copyOf);
        }
        A01.A09();
        MSLogHandlerImpl.logNative(2, str, A00(str2, th, Arrays.copyOf(objArr, length)));
    }

    public static final void A03(String str, String str2, Object... objArr) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        C14360o3.A0B(copyOf, 3);
        int length = copyOf.length;
        Arrays.copyOf(copyOf, length);
        A01.A09();
        MSLogHandlerImpl.logNative(4, str, A00(str2, null, Arrays.copyOf(copyOf, length)));
    }

    public static final void A04(String str, String str2, Object... objArr) {
        A01(str, str2, null, Arrays.copyOf(objArr, objArr.length));
    }

    public static final void A05(String str, String str2, Object... objArr) {
        A06(str, str2, Arrays.copyOf(objArr, objArr.length));
    }

    public static final void A06(String str, String str2, Object... objArr) {
        C14360o3.A0B(objArr, 3);
        int length = objArr.length;
        Arrays.copyOf(objArr, length);
        A01.A09();
        MSLogHandlerImpl.logNative(3, str, A00(str2, null, Arrays.copyOf(objArr, length)));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.facebook.mediastreaming.core.MSLogHandlerImpl, java.lang.Object] */
    public final synchronized void A09() {
        if (A00 == null) {
            A00 = new Object();
        }
    }

    public static final void A07(String str, Object... objArr) {
        Object[] copyOf = Arrays.copyOf(objArr, 0);
        C14360o3.A0B(copyOf, 3);
        String simpleName = C55692OoJ.class.getSimpleName();
        Object[] copyOf2 = Arrays.copyOf(copyOf, copyOf.length);
        C14360o3.A0B(copyOf2, 3);
        int length = copyOf2.length;
        Arrays.copyOf(copyOf2, length);
        A01.A09();
        MSLogHandlerImpl.logNative(4, simpleName, A00(str, null, Arrays.copyOf(copyOf2, length)));
    }

    public static final void A08(String str, Object... objArr) {
        Object[] copyOf = Arrays.copyOf(objArr, 0);
        C14360o3.A0B(copyOf, 3);
        int length = copyOf.length;
        Arrays.copyOf(copyOf, length);
        A01.A09();
        MSLogHandlerImpl.logNative(5, "mss:VideoEncoderSetup", A00(str, null, Arrays.copyOf(copyOf, length)));
    }
}

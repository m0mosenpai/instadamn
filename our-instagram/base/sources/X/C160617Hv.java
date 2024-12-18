package X;

import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.7Hv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160617Hv {
    public ViewGroup A00;
    public String A01;
    public String A02;
    public boolean A03;
    public final ViewStub A04;
    public final InterfaceC11380iw A05;
    public final UserSession A06;
    public final ImageUrl A07;
    public final String A08;

    public C160617Hv(ViewStub viewStub, InterfaceC11380iw interfaceC11380iw, UserSession userSession, ImageUrl imageUrl, String str) {
        C14360o3.A0B(viewStub, 3);
        this.A08 = str;
        this.A07 = imageUrl;
        this.A04 = viewStub;
        this.A05 = interfaceC11380iw;
        this.A06 = userSession;
    }

    public static final boolean A00(C160617Hv c160617Hv, CharSequence charSequence) {
        String str;
        String str2 = c160617Hv.A01;
        if (str2 == null || (str = c160617Hv.A02) == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            if (Character.isLetterOrDigit(charAt)) {
                sb.append(charAt);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        int length2 = str.length();
        for (int i2 = 0; i2 < length2; i2++) {
            char charAt2 = str.charAt(i2);
            if (Character.isDigit(charAt2)) {
                sb2.append(charAt2);
            }
        }
        String obj = sb2.toString();
        C14360o3.A07(obj);
        int length3 = str2.length();
        if (length3 <= 3) {
            return false;
        }
        String substring = str2.substring(3);
        C14360o3.A07(substring);
        StringBuilder sb3 = new StringBuilder();
        int i3 = 0;
        do {
            char charAt3 = str2.charAt(i3);
            if (Character.isDigit(charAt3)) {
                sb3.append(charAt3);
            }
            i3++;
        } while (i3 < length3);
        String obj2 = sb3.toString();
        C14360o3.A07(obj2);
        if (!AbstractC001900j.A0a(sb, obj2, false) && !AbstractC001900j.A0a(sb, obj, false) && !AbstractC001900j.A0a(sb, substring, false)) {
            return false;
        }
        return true;
    }

    public final void A01() {
        ViewGroup viewGroup = this.A00;
        if (viewGroup != null) {
            if (viewGroup.getVisibility() == 0) {
                ViewGroup viewGroup2 = this.A00;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(8);
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F("rootView");
        throw C00O.createAndThrow();
    }
}

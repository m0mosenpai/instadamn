package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.user.model.User;
import java.util.ArrayDeque;
import java.util.HashMap;

/* renamed from: X.WEl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70169WEl {
    public C70155WDf A00;
    public C69313VlL A01;
    public Integer A02;
    public String A03;
    public final Context A04;
    public final UserSession A05;
    public final User A06;
    public final C69759Vuw A07;
    public final V1X A08;
    public final C70115W4n A09;
    public final EnumC39619HeT A0A;
    public final EnumC65855TvH A0B;
    public final VG2 A0C;
    public final XEG A0D;
    public final C67844UzI A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final HashMap A0I;
    public final VgT A0J;

    /* JADX WARN: Removed duplicated region for block: B:16:0x00e9 A[Catch: IOException -> 0x0122, TryCatch #0 {IOException -> 0x0122, blocks: (B:3:0x0016, B:5:0x0022, B:6:0x0024, B:8:0x002a, B:9:0x002c, B:11:0x0032, B:14:0x00e5, B:16:0x00e9, B:17:0x00ed, B:21:0x00f1, B:23:0x00fb, B:26:0x0107, B:28:0x0115, B:32:0x00e0, B:33:0x011f, B:34:0x0124, B:36:0x0132, B:38:0x013c, B:41:0x0038, B:43:0x0046, B:44:0x004c, B:46:0x0051, B:49:0x00d6, B:60:0x0073, B:61:0x007a, B:91:0x00da), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0122 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.CharSequence A00(X.C70169WEl r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70169WEl.A00(X.WEl, java.lang.String):java.lang.CharSequence");
    }

    public final void A04(C69313VlL c69313VlL) {
        this.A01 = c69313VlL;
        V1X v1x = this.A08;
        C67915V2f c67915V2f = v1x.A08;
        for (C69313VlL c69313VlL2 : c67915V2f.A04) {
            boolean equals = c69313VlL.equals(c69313VlL2);
            if (c69313VlL2.A04 != equals) {
                c69313VlL2.A04 = equals;
            }
        }
        C67915V2f.A00(c67915V2f);
        IgdsButton igdsButton = v1x.A06;
        if (igdsButton != null) {
            igdsButton.setEnabled(true);
        }
        AbstractC35261Fgv.A02(v1x.getActivity());
    }

    public C70169WEl(Context context, UserSession userSession, User user, C69759Vuw c69759Vuw, VgT vgT, C70155WDf c70155WDf, V1X v1x, C70115W4n c70115W4n, EnumC39619HeT enumC39619HeT, EnumC65855TvH enumC65855TvH, VG2 vg2, XEG xeg, C67844UzI c67844UzI, String str, String str2, String str3, HashMap hashMap) {
        this.A04 = context;
        this.A08 = v1x;
        this.A05 = userSession;
        this.A07 = c69759Vuw;
        this.A0J = vgT;
        this.A00 = c70155WDf;
        this.A0H = str;
        this.A0F = str2;
        this.A06 = user;
        this.A0E = c67844UzI;
        this.A0A = enumC39619HeT;
        this.A0B = enumC65855TvH;
        this.A0C = vg2;
        this.A0G = str3;
        this.A0D = xeg;
        this.A09 = c70115W4n;
        this.A0I = hashMap;
        if (c67844UzI != null) {
            this.A03 = c67844UzI.A00().A0H;
            this.A02 = c67844UzI.A01();
        }
    }

    public static void A01(Context context, C1GL c1gl, C70169WEl c70169WEl, EnumC68199VFr enumC68199VFr, C69313VlL c69313VlL, Integer num, String str) {
        String str2;
        boolean A00 = AbstractC72723Nt.A00(context);
        V1X v1x = c70169WEl.A08;
        AbstractC35261Fgv.A01(v1x.getActivity());
        IgdsButton igdsButton = v1x.A06;
        if (igdsButton != null) {
            igdsButton.setLoading(true);
        }
        XEG xeg = c70169WEl.A0D;
        String str3 = null;
        if (c69313VlL != null) {
            str2 = c69313VlL.A02;
        } else {
            str2 = null;
        }
        xeg.DFU(str2);
        UserSession userSession = c70169WEl.A05;
        str.getClass();
        if (c69313VlL != null) {
            str3 = c69313VlL.A02;
        }
        C1ON A01 = AbstractC69990VzA.A01(userSession, enumC68199VFr, num, str, str3, null, null, c70169WEl.A0I, A00);
        A01.A00 = new C67956V3v(context, c1gl, c70169WEl, c69313VlL);
        c1gl.schedule(A01);
    }

    public static void A02(SpannableStringBuilder spannableStringBuilder, ArrayDeque arrayDeque) {
        C18C.A0F(!arrayDeque.isEmpty());
        C54576O9d c54576O9d = (C54576O9d) arrayDeque.removeFirst();
        spannableStringBuilder.setSpan(c54576O9d.A02, c54576O9d.A01, spannableStringBuilder.length(), c54576O9d.A00);
    }

    public final CharSequence A03(String str, String str2) {
        if (!str2.isEmpty()) {
            Context context = this.A04;
            context.getResources();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            ArrayDeque arrayDeque = new ArrayDeque();
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.append((CharSequence) " ");
            arrayDeque.addFirst(new C54576O9d(spannableStringBuilder.length(), 18, new StyleSpan(1)));
            arrayDeque.addFirst(new C54576O9d(spannableStringBuilder.length(), 18, new ForegroundColorSpan(context.getColor(R.color.blue_8))));
            arrayDeque.addFirst(new C54576O9d(spannableStringBuilder.length(), 18, new C31749Dx2(str2, this, 7)));
            spannableStringBuilder.append((CharSequence) context.getString(2131962949));
            A02(spannableStringBuilder, arrayDeque);
            A02(spannableStringBuilder, arrayDeque);
            A02(spannableStringBuilder, arrayDeque);
            return new SpannableString(spannableStringBuilder);
        }
        return str;
    }
}

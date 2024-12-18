package X;

import android.content.Context;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.text.SpannableString;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.facebook.R;
import com.facebook.tigon.tigonhuc.HucClient;
import com.instagram.api.schemas.MediaType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.7hZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C169597hZ extends AbstractC51572Yf {
    public final GestureDetector A00;
    public final C25814BbV A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final Map A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final int A0H;
    public final EnumC168517fl A0I;
    public final C169277h1 A0J;
    public final C168497fj A0K;
    public final C115925Mi A0L;
    public final C115935Mj A0M;
    public final User A0N;
    public final String A0O;
    public final boolean A0P;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        String str;
        String str2;
        C51722Yv c51722Yv;
        int i;
        String str3;
        List list;
        Object obj;
        C14360o3.A0B(c76223bS, 0);
        SpannableString spannableString = (SpannableString) AbstractC77183d4.A00(c76223bS, new C206879Ds(c76223bS, 28), new Object[0]);
        C51762Yz A00 = AbstractC77073ct.A00(c76223bS, new C206879Ds(this, 27));
        UserSession userSession = this.A03;
        String str4 = this.A04;
        C25814BbV c25814BbV = this.A01;
        CharSequence charSequence = (CharSequence) AbstractC77183d4.A00(c76223bS, new C9FP(13, A00, this, c76223bS), new Object[]{userSession, str4, c25814BbV, A00, Boolean.valueOf(this.A0C), Boolean.valueOf(this.A0E)});
        C169277h1 c169277h1 = this.A0J;
        C115925Mi c115925Mi = this.A0L;
        if (c115925Mi != null) {
            str = c115925Mi.A04;
        } else {
            str = null;
        }
        C115935Mj c115935Mj = this.A0M;
        if (c115935Mj != null) {
            str2 = c115935Mj.A01;
        } else {
            str2 = null;
        }
        C168497fj c168497fj = this.A0K;
        ImageUrl imageUrl = c168497fj.A00;
        int i2 = HucClient.BODY_UPLOAD_TIMEOUT_SECONDS;
        if (c169277h1 != null) {
            C2Z0 c2z0 = new C2Z0(c76223bS.A05, new ArrayList());
            if (!this.A0P) {
                i2 = 160;
            }
            int i3 = 8;
            if (c169277h1.A06) {
                i3 = 0;
            }
            C75933ay c75933ay = C51722Yv.A02;
            c2z0.A00(new C26609Bp6(new C51722Yv(null, new C9CU(C05F.A08, 0, Double.doubleToRawLongBits(2.0d))), c169277h1, userSession, i2, i3));
            return new C2WH(null, null, null, null, null, c2z0.A01, false);
        }
        if (str != null) {
            MediaType mediaType = null;
            C2Z0 c2z02 = new C2Z0(c76223bS.A05, new ArrayList());
            if (c115925Mi != null) {
                mediaType = c115925Mi.A00;
            }
            boolean z = this.A0P;
            int i4 = HucClient.BODY_UPLOAD_TIMEOUT_SECONDS;
            if (z) {
                i4 = 80;
            }
            c2z02.A00(new C26613BpA(mediaType, c25814BbV, this.A02, userSession, str, i4));
            return new C2WH(null, null, null, null, null, c2z02.A01, false);
        }
        if (str2 != null) {
            C2Z0 c2z03 = new C2Z0(c76223bS.A05, new ArrayList());
            C75933ay c75933ay2 = C51722Yv.A02;
            long doubleToRawLongBits = Double.doubleToRawLongBits(120.0d);
            c2z03.A00(new C25622BUk(ImageView.ScaleType.FIT_CENTER, new C51722Yv(new C51722Yv(null, new C9CU(C05F.A00, 0, doubleToRawLongBits)), new C9CU(C05F.A01, 0, doubleToRawLongBits)), this.A02, new SimpleImageUrl(str2), null, null, null, null, 3, false, false));
            return new C2WH(null, null, null, null, null, c2z03.A01, false);
        }
        if (imageUrl != null) {
            C2Z0 c2z04 = new C2Z0(c76223bS.A05, new ArrayList());
            C75933ay c75933ay3 = C51722Yv.A02;
            c2z04.A00(new C26610Bp7(new C51722Yv(null, new C9CU(C05F.A08, 0, Double.doubleToRawLongBits(2.0d))), c168497fj, c25814BbV, this.A02));
            return new C2WH(null, null, null, null, null, c2z04.A01, false);
        }
        EnumC168517fl enumC168517fl = this.A0I;
        if (enumC168517fl == EnumC168517fl.A04) {
            String A0F = AbstractC77623dm.A0F(c76223bS, 2131972522);
            C2XE c2xe = c76223bS.A05;
            int A03 = AbstractC77623dm.A03(c76223bS, AbstractC53242c7.A09(c2xe.A0C));
            C75933ay c75933ay4 = C51722Yv.A02;
            C51722Yv c51722Yv2 = new C51722Yv(new C51722Yv(null, new C9CV(C05F.A0N, AbstractC77623dm.A0F(c76223bS, 2131972522), 0)), new C9CV(C05F.A0j, 1, 0));
            Typeface typeface = Typeface.DEFAULT;
            long doubleToRawLongBits2 = Double.doubleToRawLongBits(0.0d);
            Integer num = C05F.A00;
            C77723dw A032 = C51682Yq.A03(c2xe, 0);
            A032.A0W(A0F);
            A032.A0V(null);
            A032.A0Q(A03);
            A032.A0R(C2Z3.A00(c76223bS.BoZ(), Float.floatToRawIntBits(14.0f) | 9221683186994511872L));
            A032.A0S(0);
            A032.A0T(typeface);
            A032.A0F();
            A032.A0K(C2Z3.A00(c76223bS.BoZ(), doubleToRawLongBits2));
            A032.A0I(C2Z3.A00(c76223bS.BoZ(), doubleToRawLongBits2));
            A032.A0J(C2Z3.A00(c76223bS.BoZ(), doubleToRawLongBits2));
            A032.A0H(C2Z3.A00(c76223bS.BoZ(), doubleToRawLongBits2));
            A032.A0X(num);
            A032.A0C();
            A032.A0Y(num);
            A032.A0G();
            A032.A0b(false);
            A032.A0N(0);
            A032.A0E();
            A032.A0c(true);
            A032.A0Z(true);
            A032.A0a(true);
            A032.A06(null);
            AbstractC77743dy.A00(A032, c51722Yv2);
            return A032.A0A();
        }
        if (charSequence == null || charSequence.length() == 0) {
            return null;
        }
        C75933ay c75933ay5 = C51722Yv.A02;
        String username = this.A0N.getUsername();
        if (str4 == null) {
            str4 = "";
        }
        C51722Yv c51722Yv3 = new C51722Yv(new C51722Yv(null, new C9CV(C05F.A0N, AbstractC77623dm.A0H(c76223bS, new Object[]{username, str4}, 2131972695), 0)), new C9CV(C05F.A0j, 1, 0));
        C206999Ee c206999Ee = new C206999Ee(this, 47);
        Integer num2 = C05F.A00;
        C51722Yv c51722Yv4 = new C51722Yv(new C51722Yv(c51722Yv3, new C77863eE(num2, c206999Ee, null)), new C9CV(C05F.A08, "row_comment_textview_comment", 4));
        boolean booleanValue = ((Boolean) A00.A03).booleanValue();
        if (booleanValue) {
            c51722Yv = new C51722Yv(null, new C9CV(C05F.A1F, new C9F3(38, this, A00), 4));
        } else {
            c51722Yv = null;
        }
        C51722Yv A002 = c51722Yv4.A00(c51722Yv);
        C2Z0 c2z05 = new C2Z0(c76223bS.A05, new ArrayList());
        C51722Yv c51722Yv5 = new C51722Yv(null, new C9CT(num2, 100.0f, 0));
        C2XE c2xe2 = c2z05.A00;
        C2Z0 c2z06 = new C2Z0(c2xe2, new ArrayList());
        C2XE c2xe3 = c2z06.A00;
        Context context = c2xe3.A0C;
        int A033 = AbstractC77623dm.A03(c2z06, AbstractC53242c7.A0H(context, R.attr.igds_color_primary_text));
        long floatToRawIntBits = Float.floatToRawIntBits(14.0f) | 9221683186994511872L;
        Typeface A034 = AbstractC14710oj.A03(context, Typeface.DEFAULT, num2);
        float f = 0.4f;
        if (enumC168517fl == EnumC168517fl.A02) {
            f = 1.0f;
        }
        C51722Yv A003 = AbstractC171007jr.A00(A002, f);
        if (booleanValue) {
            i = this.A0H;
            if (i == 0) {
                i = 2;
            }
        } else {
            i = Integer.MAX_VALUE;
        }
        long doubleToRawLongBits3 = Double.doubleToRawLongBits(0.0d);
        C77723dw A035 = C51682Yq.A03(c2xe3, 0);
        A035.A0W(charSequence);
        A035.A0V(null);
        A035.A0Q(A033);
        A035.A0R(C2Z3.A00(c2z06.BoZ(), floatToRawIntBits));
        A035.A0S(0);
        A035.A0T(A034);
        A035.A0P(-7829368);
        A035.A0K(C2Z3.A00(c2z06.BoZ(), doubleToRawLongBits3));
        A035.A0I(C2Z3.A00(c2z06.BoZ(), doubleToRawLongBits3));
        A035.A0J(C2Z3.A00(c2z06.BoZ(), doubleToRawLongBits3));
        A035.A0H(C2Z3.A00(c2z06.BoZ(), doubleToRawLongBits3));
        A035.A0X(num2);
        A035.A0C();
        A035.A0Y(num2);
        A035.A0L(1.0f);
        A035.A0b(false);
        A035.A0N(0);
        A035.A0M(i);
        A035.A0c(true);
        A035.A0Z(true);
        A035.A0a(true);
        if (spannableString != null) {
            A035.A01.A0R = spannableString;
        }
        A035.A06(null);
        AbstractC77743dy.A00(A035, A003);
        c2z06.A00(A035.A0A());
        c2z05.A00(AbstractC76963ci.A0J(c2z06, c2z05, c51722Yv5, null, null, null, null, null, false));
        String str5 = this.A0O;
        if (str5 != null && (str3 = this.A05) != null && (list = this.A07) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (!((InterfaceC43528JKo) obj).CRI()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            InterfaceC43528JKo interfaceC43528JKo = (InterfaceC43528JKo) obj;
            if (interfaceC43528JKo != null) {
                C51722Yv c51722Yv6 = new C51722Yv(null, new C9CT(num2, 100.0f, 0));
                C2Z0 c2z07 = new C2Z0(c2xe2, new ArrayList());
                c2z07.A00(new C26614BpB(c25814BbV, this.A02, interfaceC43528JKo.BSQ(), str5, str3, interfaceC43528JKo.Am3()));
                c2z05.A00(AbstractC76963ci.A0I(c2z07, c2z05, c51722Yv6));
            }
        }
        return new C2WF(null, null, null, c2z05.A01, false);
    }

    public C169597hZ(GestureDetector gestureDetector, EnumC168517fl enumC168517fl, C169277h1 c169277h1, C168497fj c168497fj, C25814BbV c25814BbV, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C115925Mi c115925Mi, C115935Mj c115935Mj, User user, String str, String str2, String str3, String str4, List list, Map map, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        C14360o3.A0B(interfaceC11380iw, 18);
        C14360o3.A0B(userSession, 19);
        this.A0N = user;
        this.A04 = str;
        this.A0B = z;
        this.A05 = str2;
        this.A07 = list;
        this.A0O = str3;
        this.A0J = c169277h1;
        this.A0L = c115925Mi;
        this.A0M = c115935Mj;
        this.A0I = enumC168517fl;
        this.A0P = z2;
        this.A0C = z3;
        this.A0D = z4;
        this.A09 = z5;
        this.A0F = z6;
        this.A0G = z7;
        this.A0K = c168497fj;
        this.A02 = interfaceC11380iw;
        this.A03 = userSession;
        this.A01 = c25814BbV;
        this.A00 = gestureDetector;
        this.A08 = map;
        this.A0E = z8;
        this.A06 = str4;
        this.A0A = z9;
        this.A0H = i;
    }

    public static final void A03(GestureDetector gestureDetector) {
        gestureDetector.onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
    }
}

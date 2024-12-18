package X;

import android.content.Context;
import android.text.SpannableString;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.List;

/* renamed from: X.LjE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48862LjE implements C79O {
    public final int A00;
    public final Object A01;

    public C48862LjE(AnonymousClass795 anonymousClass795, int i) {
        this.A00 = i;
        this.A01 = anonymousClass795;
    }

    @Override // X.C79O
    public final InterfaceC129555tK AXf(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C18A c18a) {
        Integer num;
        Integer num2;
        ImmutableList copyOf;
        Integer num3;
        CharSequence charSequence;
        switch (this.A00) {
            case 0:
                C17050sx A01 = AbstractC09440dt.A01(new M8X(1));
                C83403nh c83403nh = c160787Im.A0e;
                C7QL A04 = C7QK.A04(userSession, anonymousClass988, c160787Im, c7im, c83403nh.A10, A01);
                C14360o3.A0B(context, 0);
                AbstractC167007dF.A1E(userSession, 1, anonymousClass988);
                AnonymousClass189.A00(userSession).A02(c83403nh.A1u);
                C910143t A00 = AbstractC158887Ba.A00(c83403nh);
                DirectMessageIdentifier A0V = c83403nh.A0V();
                boolean A03 = AbstractC158887Ba.A03(userSession, c83403nh);
                String str = c83403nh.A1u;
                C14360o3.A07(str);
                String A0z = AbstractC43593JPy.A0z(c160787Im.A0K);
                C7QX A0d = AbstractC43592JPx.A0d(context, userSession, anonymousClass988, c160787Im, c83403nh);
                InterfaceC83733oI interfaceC83733oI = c160787Im.A0G.A0P;
                String str2 = c83403nh.A1V;
                GifUrlImpl gifUrlImpl = A00.A0Z;
                SpannableString A002 = AbstractC1583478u.A00(A00.A1Q, A00.A1O);
                C1579877i c1579877i = null;
                ImageUrl imageUrl = null;
                if (A002 != null) {
                    Integer num4 = A00.A0l;
                    if (num4 != null && num4.intValue() == 1) {
                        num3 = Integer.valueOf(anonymousClass988.A00);
                    } else {
                        num3 = null;
                    }
                    String str3 = A00.A1K;
                    User user = (User) AnonymousClass189.A00(userSession).A02.get(A002.toString());
                    if (user != null) {
                        imageUrl = user.Bhu();
                    }
                    EnumC910343v enumC910343v = A00.A0P;
                    String str4 = A00.A0v;
                    if (str4 != null) {
                        charSequence = str4;
                        if (AbstractC167007dF.A1Z(anonymousClass988.A0t)) {
                            charSequence = JX9.A01(str4);
                        }
                    } else {
                        charSequence = null;
                    }
                    String str5 = A00.A1O;
                    int i = A00.A07;
                    Integer valueOf = Integer.valueOf(A00.A06);
                    String str6 = A00.A1S;
                    ImageUrl imageUrl2 = imageUrl;
                    CharSequence charSequence2 = charSequence;
                    c1579877i = new C1579877i(imageUrl2, A00.A0Y, enumC910343v, A002, str3, charSequence2, str5, A00.A1M, A00.A1L, num3, valueOf, A00.A0l, Integer.valueOf(A00.A0A), str6, A00.A11, i);
                }
                String str7 = A00.A0w;
                if (str7 == null) {
                    str7 = "";
                }
                C9C9 c9c9 = new C9C9(str7, str, 5);
                ExtendedImageUrl extendedImageUrl = A00.A0X;
                AbstractC1583778x abstractC1583778x = null;
                if (extendedImageUrl == null) {
                    if (A00.A09 == 1) {
                        abstractC1583778x = C45932KUj.A00;
                    }
                } else if (!A00.A05() || A03) {
                    int width = extendedImageUrl.getWidth();
                    if (width > 0) {
                        num = Integer.valueOf(width);
                    } else {
                        A00.A03();
                        num = null;
                    }
                    int height = extendedImageUrl.getHeight();
                    if (height > 0) {
                        num2 = Integer.valueOf(height);
                    } else {
                        A00.A03();
                        num2 = null;
                    }
                    Integer num5 = A00.A0h;
                    Integer num6 = A00.A0g;
                    boolean equals = Boolean.TRUE.equals(A00.A0e);
                    abstractC1583778x = new C158737Aj(extendedImageUrl, Boolean.valueOf(equals), AbstractC25227BEk.A0m(), num, num2, num5, num6, Integer.valueOf(R.drawable.instagram_reels_pano_filled_24), A00.A0z, null);
                }
                List list = A00.A1g;
                if (list == null) {
                    copyOf = null;
                } else {
                    copyOf = ImmutableList.copyOf((Collection) list);
                }
                EnumC910243u enumC910243u = A00.A0Q;
                C14360o3.A07(enumC910243u);
                int i2 = A00.A00;
                List A02 = A00.A02();
                int i3 = A00.A01;
                Long l = A00.A0o;
                String str8 = A00.A1Q;
                Boolean bool = Boolean.TRUE;
                boolean equals2 = bool.equals(A00.A0b);
                int i4 = A00.A0B;
                return new C7QY(null, null, null, c9c9, null, null, null, null, A0d, A04, c1579877i, null, abstractC1583778x, null, null, null, enumC910243u, null, A0V, interfaceC83733oI, gifUrlImpl, A00.A0a, null, l, A00.A0p, A00.A0q, A0z, str8, null, A00.A1I, null, str2, null, null, null, null, null, copyOf, A02, i2, i3, i4, equals2, false, bool.equals(Boolean.valueOf(A00.A1k)), false, false, false, false, false, false, false);
            case 1:
                C98K c98k = ((AnonymousClass795) this.A01).A0C;
                C14360o3.A0B(context, 0);
                JQ0.A1O(userSession, c7im, c160787Im, anonymousClass988, c98k);
                AnonymousClass781 A042 = C1580677q.A04(context, userSession, c98k, anonymousClass988, c160787Im, c7im, AbstractC1580777r.A00.A04(userSession, c160787Im), c160787Im.A0U, true);
                CharSequence charSequence3 = A042.A04;
                boolean z = A042.A0D;
                boolean z2 = A042.A0B;
                boolean z3 = A042.A0G;
                C7QL c7ql = A042.A03;
                C7QX c7qx = A042.A02;
                AnonymousClass541 anonymousClass541 = A042.A00;
                List list2 = A042.A08;
                return new AnonymousClass781(anonymousClass541, A042.A01, c7qx, c7ql, charSequence3, A042.A06, A042.A07, list2, z, z2, z3, A042.A0E, A042.A0A, false, A042.A09, A042.A0C);
            default:
                return AnonymousClass795.A08(context, userSession, anonymousClass988, c160787Im, c7im);
        }
    }
}

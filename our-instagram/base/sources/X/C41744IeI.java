package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.IeI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41744IeI {
    public final UserSession A00;

    public final JFV A04(C38321qM c38321qM, InterfaceC30995Dju interfaceC30995Dju, IC7 ic7) {
        int i;
        Object[] objArr;
        SpannableStringBuilder spannableStringBuilder;
        JFV h7r;
        int i2;
        int i3;
        Object[] objArr2;
        SpannableStringBuilder spannableStringBuilder2;
        Context context;
        int A06 = AbstractC167007dF.A06(0, c38321qM, interfaceC30995Dju);
        UserSession userSession = this.A00;
        if (C76833cV.A07(userSession, c38321qM)) {
            User A2E = c38321qM.A2E(userSession);
            if (A2E != null) {
                int size = c38321qM.A3i().size();
                if (size != 1 && C18U.A06(C06090Tz.A05, userSession, 36323844092538501L)) {
                    if (size == A06) {
                        String A02 = A02(this, A2E, false);
                        List A3i = c38321qM.A3i();
                        ArrayList A1E = AbstractC166987dD.A1E();
                        for (Object obj : A3i) {
                            AbstractC25232BEp.A1Q(AbstractC76433bn.A00((User) obj), userSession.userId, obj, A1E);
                        }
                        String A022 = A02(this, (User) AbstractC001800i.A0J(A1E), false);
                        i3 = 2131969803;
                        if (c38321qM.A1z() == ProductType.CLIPS) {
                            i3 = 2131971727;
                        }
                        objArr2 = new Object[]{A02, A022};
                    } else {
                        String A023 = A02(this, A2E, false);
                        int A03 = AbstractC31172DnG.A03(c38321qM.A3i(), 1);
                        int i4 = 2131969804;
                        if (c38321qM.A1z() == ProductType.CLIPS) {
                            i4 = 2131971728;
                        }
                        Object[] A1Y = AbstractC25228BEl.A1Y(A03);
                        context = ic7.A00;
                        String string = context.getString(2131956338, Arrays.copyOf(A1Y, 1));
                        C14360o3.A07(string);
                        spannableStringBuilder2 = A00(context, c38321qM, this, Arrays.copyOf(new Object[]{A023, string}, A06), i4);
                        AnonymousClass773.A03(spannableStringBuilder2, new C25715BYa(0, c38321qM, interfaceC30995Dju), string);
                        h7r = new H7S(spannableStringBuilder2, new C45127Jxw(AbstractC166997dE.A0p(context, 2131969758), new D8M(34, interfaceC30995Dju, c38321qM)));
                    }
                } else {
                    String A024 = A02(this, A2E, false);
                    i3 = 2131969802;
                    if (c38321qM.A1z() == ProductType.CLIPS) {
                        i3 = 2131971726;
                    }
                    objArr2 = new Object[]{A024};
                }
                context = ic7.A00;
                spannableStringBuilder2 = A00(context, c38321qM, this, Arrays.copyOf(objArr2, objArr2.length), i3);
                h7r = new H7S(spannableStringBuilder2, new C45127Jxw(AbstractC166997dE.A0p(context, 2131969758), new D8M(34, interfaceC30995Dju, c38321qM)));
            }
            h7r = C42604ItN.A00;
        } else {
            if (C14360o3.A0K(AbstractC37303Gc4.A0T(userSession, c38321qM), userSession.userId) && AbstractC166987dD.A1b(c38321qM.A3i())) {
                int size2 = c38321qM.A3i().size();
                if (size2 != 1 && C18U.A06(C06090Tz.A05, userSession, 36323844092407427L)) {
                    boolean A032 = A03(c38321qM);
                    if (size2 == A06) {
                        if (!A032) {
                            i = 2131969831;
                        } else {
                            i = 2131972882;
                            if (c38321qM.A1z() == ProductType.CLIPS) {
                                i = 2131972881;
                            }
                        }
                        objArr = new Object[]{A02(this, (User) AbstractC001800i.A0J(c38321qM.A3i()), true), A02(this, (User) AbstractC001800i.A0O(c38321qM.A3i(), 1), true)};
                    } else {
                        if (!A032) {
                            i2 = 2131969832;
                        } else {
                            i2 = 2131972884;
                            if (c38321qM.A1z() == ProductType.CLIPS) {
                                i2 = 2131972883;
                            }
                        }
                        String A025 = A02(this, (User) AbstractC001800i.A0J(c38321qM.A3i()), true);
                        Object[] A1Y2 = AbstractC25228BEl.A1Y(AbstractC31172DnG.A03(c38321qM.A3i(), 1));
                        Context context2 = ic7.A00;
                        String string2 = context2.getString(2131956338, Arrays.copyOf(A1Y2, 1));
                        C14360o3.A07(string2);
                        spannableStringBuilder = A00(context2, c38321qM, this, Arrays.copyOf(new Object[]{A025, string2}, A06), i2);
                        AnonymousClass773.A03(spannableStringBuilder, new C25715BYa(1, c38321qM, interfaceC30995Dju), string2);
                        h7r = new H7R(spannableStringBuilder);
                    }
                } else {
                    String A026 = A02(this, (User) AbstractC001800i.A0J(c38321qM.A3i()), true);
                    if (!A03(c38321qM)) {
                        i = 2131969830;
                    } else {
                        i = 2131972880;
                        if (c38321qM.A1z() == ProductType.CLIPS) {
                            i = 2131972879;
                        }
                    }
                    objArr = new Object[]{A026};
                }
                spannableStringBuilder = A00(ic7.A00, c38321qM, this, Arrays.copyOf(objArr, objArr.length), i);
                h7r = new H7R(spannableStringBuilder);
            }
            h7r = C42604ItN.A00;
        }
        return h7r;
    }

    public static final SpannableStringBuilder A01(C38321qM c38321qM, C41744IeI c41744IeI, String str, int i) {
        UserSession userSession = c41744IeI.A00;
        C85383rT c85383rT = new C85383rT(AbstractC25225BEi.A0H(str), userSession);
        c85383rT.A0L = true;
        c85383rT.A01 = i;
        c85383rT.A0Q = true;
        c85383rT.A03(new C85393rU(userSession, c38321qM, false));
        SpannableStringBuilder A00 = c85383rT.A00();
        C14360o3.A07(A00);
        return A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A02(X.C41744IeI r3, com.instagram.user.model.User r4, boolean r5) {
        /*
            if (r4 != 0) goto L5
            java.lang.String r0 = ""
            return r0
        L5:
            com.instagram.common.session.UserSession r3 = r3.A00
            X.0Tz r2 = X.C06090Tz.A05
            if (r5 != 0) goto L28
            r0 = 36323844092604038(0x810c5800042e86, double:3.034683496318403E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto L3b
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36323844092735112(0x810c5800062e88, double:3.034683496401295E-306)
        L1d:
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto L3b
            java.lang.String r0 = r4.getUsername()
            return r0
        L28:
            r0 = 36323844092669575(0x810c5800052e87, double:3.034683496359849E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto L3b
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36323844092800649(0x810c5800072e89, double:3.0346834964427407E-306)
            goto L1d
        L3b:
            r1 = 64
            java.lang.String r0 = r4.getUsername()
            java.lang.String r0 = X.AnonymousClass001.A0D(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41744IeI.A02(X.IeI, com.instagram.user.model.User, boolean):java.lang.String");
    }

    public static final boolean A03(C38321qM c38321qM) {
        JKD Ar6;
        if (c38321qM.A0C.Ar6() != null && (Ar6 = c38321qM.A0C.Ar6()) != null && Ar6.BqX() != null) {
            return true;
        }
        return false;
    }

    public C41744IeI(UserSession userSession) {
        this.A00 = userSession;
    }

    public static SpannableStringBuilder A00(Context context, C38321qM c38321qM, C41744IeI c41744IeI, Object[] objArr, int i) {
        String string = context.getString(i, objArr);
        C14360o3.A07(string);
        return A01(c38321qM, c41744IeI, string, context.getColor(AbstractC53242c7.A0A(context)));
    }
}

package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes8.dex */
public final class MCY extends C06840Yb implements InterfaceC16620sF {
    public final int A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MCY(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L13;
                case 1: goto L1b;
                default: goto L6;
            }
        L6:
            java.lang.Class<X.KDY> r3 = X.KDY.class
            r1 = 2
            java.lang.String r4 = "handleEvent"
            java.lang.String r5 = "handleEvent(Lcom/instagram/friendmap/viewmodel/FriendMapPresenceReplyViewModel$UIEvent;)V"
        Ld:
            r6 = 4
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L13:
            java.lang.Class<X.P0W> r3 = X.P0W.class
            r1 = 2
            java.lang.String r4 = "bindCrosspostUi"
            java.lang.String r5 = "bindCrosspostUi(Lcom/instagram/creation/sharesheet/viewmodel/ThreadsXpostViewModel$UiState;)V"
            goto Ld
        L1b:
            java.lang.Class<X.KDY> r3 = X.KDY.class
            r1 = 2
            java.lang.String r4 = "handleState"
            java.lang.String r5 = "handleState(Lcom/instagram/friendmap/viewmodel/FriendMapPresenceReplyViewModel$UIState;)V"
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MCY.<init>(java.lang.Object, int):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str;
        String profilePicUrl;
        Drawable drawable;
        String str2;
        TextView textView;
        SpannableString A07;
        String str3;
        List list;
        InterfaceC50424MOe interfaceC50424MOe;
        C6C9 BXJ;
        switch (this.A00) {
            case 0:
                C51756Mtf c51756Mtf = (C51756Mtf) obj;
                P0W p0w = (P0W) this.receiver;
                C52368NFi c52368NFi = p0w.A00;
                EnumC53307Nhj enumC53307Nhj = null;
                if (c52368NFi != null) {
                    InterfaceC173987oq interfaceC173987oq = (InterfaceC173987oq) c51756Mtf.A00;
                    if (interfaceC173987oq != null) {
                        str = interfaceC173987oq.getUsername();
                    } else {
                        str = null;
                    }
                    c52368NFi.setTitle(str);
                    C52368NFi c52368NFi2 = p0w.A00;
                    if (c52368NFi2 != null) {
                        AbstractC59962oe abstractC59962oe = p0w.A01;
                        Context requireContext = abstractC59962oe.requireContext();
                        String string = abstractC59962oe.requireContext().getString(2131975517);
                        Context requireContext2 = abstractC59962oe.requireContext();
                        if (interfaceC173987oq != null) {
                            enumC53307Nhj = interfaceC173987oq.AY3();
                        }
                        c52368NFi2.setSubtitle(AbstractC31174DnI.A0t(requireContext, string, C50701MZw.A03(requireContext2, enumC53307Nhj), 2131971975));
                        if (interfaceC173987oq != null && (profilePicUrl = interfaceC173987oq.getProfilePicUrl()) != null && (drawable = abstractC59962oe.requireContext().getDrawable(R.drawable.avatar_bottom_badge_threads)) != null) {
                            C52368NFi c52368NFi3 = p0w.A00;
                            if (c52368NFi3 != null) {
                                c52368NFi3.setProfileImage(abstractC59962oe, profilePicUrl, drawable);
                            }
                        }
                        return C0eB.A00;
                    }
                }
                C14360o3.A0F("shareToThreadsContainer");
                throw C00O.createAndThrow();
            case 1:
                C45290K2s c45290K2s = (C45290K2s) obj;
                KDY kdy = (KDY) this.receiver;
                ((C148396m9) kdy.A0E.getValue()).A01(null, c45290K2s.A03, true);
                C45128JyU c45128JyU = c45290K2s.A00;
                if (c45128JyU != null) {
                    kdy.A00 = c45128JyU;
                    C09530e4 A072 = AbstractC44198Jg1.A07(kdy.requireContext(), c45128JyU.A02);
                    String str4 = (String) A072.A00;
                    boolean A1a = AbstractC166987dD.A1a(A072.A01);
                    IgImageView A0V = AbstractC43592JPx.A0V(kdy.A0G);
                    User user = c45128JyU.A06;
                    AbstractC31173DnH.A1T(kdy, A0V, user);
                    ((TextView) kdy.A0I.getValue()).setText(user.B8y());
                    int i = R.attr.igds_color_secondary_text;
                    if (A1a) {
                        i = R.attr.igds_color_active_badge;
                    }
                    int A09 = AbstractC167007dF.A09(kdy.requireContext(), i);
                    C4F5 c4f5 = c45128JyU.A05;
                    boolean A1W = AbstractC167007dF.A1W(c4f5);
                    InterfaceC09390do interfaceC09390do = kdy.A07;
                    if (A1W) {
                        AbstractC43593JPy.A1W(interfaceC09390do, 0);
                        String str5 = null;
                        kdy.A05.A00(new C51688MsJ(c45290K2s.A02, 9), null, kdy.A04, (IgBouncyUfiButtonImageView) interfaceC09390do.getValue());
                        InterfaceC09390do interfaceC09390do2 = kdy.A0H;
                        ((TextView) interfaceC09390do2.getValue()).setMaxLines(2);
                        if (c45128JyU.A04() && c45128JyU.A07 != C05F.A00) {
                            TextView textView2 = (TextView) interfaceC09390do2.getValue();
                            if (c4f5 != null && (list = c4f5.A0J) != null && (interfaceC50424MOe = (InterfaceC50424MOe) AbstractC001800i.A0J(list)) != null && (BXJ = interfaceC50424MOe.BXJ()) != null) {
                                str5 = BXJ.A0J;
                            }
                            textView2.setText(str5);
                            AbstractC31177DnL.A0q(kdy.requireContext(), (TextView) interfaceC09390do2.getValue(), R.attr.igds_color_primary_text);
                        } else {
                            Integer num = c45128JyU.A07;
                            Integer num2 = C05F.A00;
                            TextView textView3 = (TextView) interfaceC09390do2.getValue();
                            if (num == num2) {
                                str3 = kdy.requireContext().getString(2131962910);
                            } else {
                                str3 = c45128JyU.A09;
                            }
                            textView3.setText(str3);
                        }
                        String A0q = AbstractC166997dE.A0q(AbstractC166997dE.A0N(kdy), 2131962905);
                        String A0g = AnonymousClass001.A0g(A0q, " • ", str4);
                        textView = (TextView) kdy.A0F.getValue();
                        A07 = AbstractC43592JPx.A07(A0g);
                        A07.setSpan(new ForegroundColorSpan(A09), A0q.length() + 3, A0g.length(), 33);
                    } else {
                        AbstractC43593JPy.A1Q(interfaceC09390do.getValue());
                        InterfaceC09390do interfaceC09390do3 = kdy.A0H;
                        ((TextView) interfaceC09390do3.getValue()).setMaxLines(1);
                        String str6 = c45128JyU.A09;
                        if (str6 != null && str6.length() != 0) {
                            str2 = AnonymousClass001.A0g(str4, " • ", str6);
                        } else {
                            str2 = str4;
                        }
                        textView = (TextView) interfaceC09390do3.getValue();
                        A07 = AbstractC43592JPx.A07(str2);
                        A07.setSpan(new ForegroundColorSpan(A09), 0, str4.length(), 33);
                    }
                    textView.setText(A07);
                }
                return C0eB.A00;
            default:
                MSR msr = (MSR) obj;
                KDY kdy2 = (KDY) this.receiver;
                if (msr instanceof C49423Lsx) {
                    InterfaceC09390do interfaceC09390do4 = kdy2.A0A;
                    AbstractC166987dD.A0d(interfaceC09390do4).clearFocus();
                    AbstractC13880nE.A0O(AbstractC166987dD.A0d(interfaceC09390do4));
                    AbstractC25233BEq.A14(kdy2);
                } else if (msr instanceof C49422Lsw) {
                    C49422Lsw c49422Lsw = (C49422Lsw) msr;
                    C41451vu c41451vu = C41451vu.A01;
                    C146106i8 A0K = AbstractC31171DnF.A0K();
                    A0K.A0D = AbstractC47027Kqk.A00(kdy2.requireContext(), c49422Lsw.A02);
                    A0K.A0D(AbstractC47027Kqk.A00(kdy2.requireContext(), c49422Lsw.A01));
                    A0K.A06();
                    A0K.A0B(EnumC142006bJ.A02);
                    A0K.A09 = c49422Lsw.A00;
                    A0K.A0L = true;
                    C49494Lu7.A00(A0K, c49422Lsw, kdy2, 6);
                    AbstractC31178DnM.A1N(c41451vu, A0K);
                } else if (msr instanceof C49424Lsy) {
                    C2UY.A01.A03();
                } else {
                    throw B4Z.A00();
                }
                return C0eB.A00;
        }
    }
}

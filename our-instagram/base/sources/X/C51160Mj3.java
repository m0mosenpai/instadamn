package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.api.schemas.LiveUserPaySupportTier;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.Mj3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51160Mj3 extends C2UU {
    public C51607Mqz A01;
    public final InterfaceC11380iw A02;
    public final N7O A04;
    public final boolean A05;
    public final boolean A06;
    public final C52348NEm A03 = new C52348NEm(null);
    public C56120Ovf A00 = new C56120Ovf(EnumC33419Epq.NONE, "load_more_default_key");

    public final void A00(C51607Mqz c51607Mqz) {
        EnumC33419Epq enumC33419Epq;
        C14360o3.A0B(c51607Mqz, 0);
        this.A01 = c51607Mqz;
        if (c51607Mqz.A03) {
            enumC33419Epq = EnumC33419Epq.LOADING;
        } else {
            enumC33419Epq = EnumC33419Epq.NONE;
        }
        this.A00 = new C56120Ovf(enumC33419Epq, "load_more_default_key");
        notifyDataSetChanged();
    }

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        String str;
        C14360o3.A0B(c3oo, 0);
        int itemViewType = getItemViewType(i);
        if (itemViewType != 1) {
            if (itemViewType == 4) {
                C56120Ovf c56120Ovf = this.A00;
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                ((C51267Mkq) c3oo).A00.setState(c56120Ovf.A00);
                return;
            }
            return;
        }
        C51607Mqz c51607Mqz = this.A01;
        if (c51607Mqz == null) {
            return;
        }
        C51344Mm5 c51344Mm5 = (C51344Mm5) c3oo;
        MX6 mx6 = (MX6) AbstractC31173DnH.A0i(c51607Mqz.A01, i);
        InterfaceC11380iw interfaceC11380iw = this.A02;
        N7O n7o = this.A04;
        C14360o3.A0B(mx6, 0);
        User user = (User) mx6.A02;
        int i3 = 0;
        if (user != null) {
            AbstractC31173DnH.A1F(c51344Mm5.A02, user);
            c51344Mm5.A05.setVisibility(AbstractC167007dF.A05(user.isVerified() ? 1 : 0));
            LiveUserPaySupportTier liveUserPaySupportTier = (LiveUserPaySupportTier) mx6.A01;
            if (liveUserPaySupportTier != null) {
                Context A03 = AbstractC37301Gc2.A03(c51344Mm5);
                IgImageView igImageView = c51344Mm5.A04;
                C14360o3.A06(igImageView);
                TextView textView = c51344Mm5.A00;
                C14360o3.A06(textView);
                AbstractC54905OQc.A01(A03, igImageView, textView, liveUserPaySupportTier, mx6.A00);
            }
            AbstractC31173DnH.A1T(interfaceC11380iw, c51344Mm5.A03, user);
            ViewOnClickListenerC55468OkN.A00(c51344Mm5.itemView, 55, n7o, user);
        }
        OKz oKz = n7o.A02;
        if (oKz != null) {
            String str2 = "";
            if (C14360o3.A0K(oKz.A00, "time") && mx6.A03.length() > 0) {
                TextView textView2 = c51344Mm5.A01;
                textView2.setVisibility(0);
                Resources resources = c51344Mm5.itemView.getResources();
                C14360o3.A07(resources);
                textView2.setText(C23831Eq.A09(resources, Double.parseDouble(mx6.A03)));
                str = C23831Eq.A03(AbstractC37301Gc2.A03(c51344Mm5), Double.parseDouble(mx6.A03));
            } else {
                OKz oKz2 = n7o.A02;
                if (oKz2 != null) {
                    if (!C14360o3.A0K(oKz2.A00, "amount") || mx6.A04 == null) {
                        str = "";
                    } else {
                        TextView textView3 = c51344Mm5.A01;
                        textView3.setVisibility(0);
                        textView3.setText(mx6.A04);
                        str = AbstractC166997dE.A0r(AbstractC25228BEl.A0M(c51344Mm5.itemView), String.valueOf(mx6.A04), 2131953632);
                    }
                }
            }
            if (mx6.A00 > 1) {
                str2 = AbstractC43594JPz.A0t(AbstractC25228BEl.A0M(c51344Mm5.itemView), mx6.A00 - 1, 2131953633);
            }
            C14360o3.A0A(str2);
            View findViewById = c51344Mm5.itemView.findViewById(R.id.user_pay_supporter_row);
            Resources A0M = AbstractC25228BEl.A0M(c51344Mm5.itemView);
            CharSequence text = c51344Mm5.A02.getText();
            LiveUserPaySupportTier liveUserPaySupportTier2 = (LiveUserPaySupportTier) mx6.A01;
            if (liveUserPaySupportTier2 != null) {
                i3 = liveUserPaySupportTier2.ordinal();
            }
            findViewById.setContentDescription(A0M.getString(2131953631, text, Integer.valueOf(i3 + 1), str2, str));
            return;
        }
        C14360o3.A0F("interactor");
        throw C00O.createAndThrow();
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate;
        int i2;
        C14360o3.A0B(viewGroup, 0);
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    if (i == 4) {
                        C52348NEm c52348NEm = this.A03;
                        LayoutInflater.from(viewGroup.getContext());
                        return c52348NEm.A00(viewGroup);
                    }
                    throw AbstractC31175DnJ.A0U("Unsupported view type: ", i);
                }
                inflate = AbstractC25228BEl.A0P(viewGroup).inflate(R.layout.supporters_list_empty_state_insights_gone, viewGroup, false);
                i2 = 4;
            } else {
                int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51344Mm5(AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.iglive_user_pay_supporter, false));
            }
        } else {
            inflate = AbstractC25228BEl.A0P(viewGroup).inflate(R.layout.iglive_user_pay_supporter_list_empty_state, viewGroup, false);
            if (this.A05) {
                inflate.setVisibility(0);
            }
            i2 = 3;
        }
        return new C51230MkF(inflate, i2);
    }

    public C51160Mj3(InterfaceC11380iw interfaceC11380iw, N7O n7o, boolean z, boolean z2) {
        this.A02 = interfaceC11380iw;
        this.A04 = n7o;
        this.A05 = z;
        this.A06 = z2;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        ArrayList arrayList;
        int A03 = C0f9.A03(-1461787732);
        C51607Mqz c51607Mqz = this.A01;
        int i = 1;
        if (c51607Mqz != null && (arrayList = c51607Mqz.A01) != null && AbstractC25226BEj.A1b(arrayList)) {
            C51607Mqz c51607Mqz2 = this.A01;
            if (c51607Mqz2 != null) {
                i = c51607Mqz2.A01.size();
            } else {
                IllegalStateException A0g = AbstractC166997dE.A0g();
                C0f9.A0A(-1673048486, A03);
                throw A0g;
            }
        }
        C0f9.A0A(-865892307, A03);
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002a, code lost:
    
        if (r2 != null) goto L18;
     */
    @Override // X.C2UU, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getItemViewType(int r5) {
        /*
            r4 = this;
            r0 = -1659874950(0xffffffff9d10517a, float:-1.9100364E-21)
            int r3 = X.C0f9.A03(r0)
            X.Mqz r2 = r4.A01
            r1 = 1
            if (r2 == 0) goto L18
            boolean r0 = r2.A03
            if (r0 != r1) goto L18
            r1 = 4
        L11:
            r0 = 221200730(0xd2f415a, float:5.4004703E-31)
            X.C0f9.A0A(r0, r3)
            return r1
        L18:
            boolean r0 = r4.A06
            if (r0 == 0) goto L2a
            if (r2 == 0) goto L11
            java.util.ArrayList r0 = r2.A01
            if (r0 == 0) goto L2c
            boolean r0 = r0.isEmpty()
            if (r0 != r1) goto L2c
            r1 = 3
            goto L11
        L2a:
            if (r2 == 0) goto L11
        L2c:
            java.util.ArrayList r0 = r2.A01
            if (r0 == 0) goto L11
            boolean r0 = r0.isEmpty()
            if (r0 != r1) goto L11
            r1 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51160Mj3.getItemViewType(int):int");
    }
}

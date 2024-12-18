package X;

import android.app.Activity;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.loadmore.LoadMoreButton;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Mj5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51162Mj5 extends C2UU {
    public String A00;
    public boolean A01;
    public final Activity A07;
    public final InterfaceC11380iw A08;
    public final UserSession A09;
    public final C56247Oxu A0A;
    public final C56247Oxu A0B;
    public final InterfaceC62602sz A0C;
    public final Boolean A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final List A0H = AbstractC166987dD.A1E();
    public final List A05 = AbstractC166987dD.A1E();
    public final List A06 = AbstractC166987dD.A1E();
    public final List A04 = AbstractC166987dD.A1E();
    public final List A03 = AbstractC166987dD.A1E();
    public final List A02 = AbstractC166987dD.A1E();

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                            return new C51353MmE(LayoutInflater.from(this.A07).inflate(R.layout.active_fundraiser_row, viewGroup, false), this.A0A);
                        }
                        throw AbstractC166987dD.A1D(AnonymousClass001.A0O("Unknown view type: ", i));
                    }
                    int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                    return new C51237MkM(LoadMoreButton.A00(this.A07, R.layout.fundraiser_sticker_search_row_empty_state, viewGroup));
                }
                int i4 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51236MkL(LayoutInflater.from(this.A07).inflate(R.layout.fundraiser_sticker_search_row_description, viewGroup, false));
            }
            int i5 = C3OO.FLAG_ADAPTER_FULLUPDATE;
            return new C51238MkN(LayoutInflater.from(this.A07).inflate(R.layout.fundraiser_sticker_search_row_section_title, viewGroup, false));
        }
        int i6 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        Activity activity = this.A07;
        return new C51357MmI(activity, LayoutInflater.from(activity).inflate(R.layout.row_search_user, viewGroup, false), this.A0B);
    }

    public final int A00() {
        Iterator it = this.A04.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = AbstractC31172DnG.A02(((HAS) it.next()).A01, i);
        }
        if (this.A01) {
            return this.A06.size();
        }
        return this.A05.size() + i;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01() {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51162Mj5.A01():void");
    }

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        View A01;
        View.OnClickListener A00;
        String str;
        TextView textView;
        C54666OCs c54666OCs = (C54666OCs) this.A0H.get(i);
        int i2 = c54666OCs.A00;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        C51353MmE c51353MmE = (C51353MmE) c3oo;
                        C214499en c214499en = c54666OCs.A01;
                        c214499en.getClass();
                        ViewGroup viewGroup = c51353MmE.A01;
                        viewGroup.setBackground(null);
                        ViewOnClickListenerC55464OkJ.A01(viewGroup, 31, c214499en, c51353MmE);
                        c51353MmE.A05.setText(c214499en.A07);
                        c51353MmE.A04.setText(c214499en.A02);
                        c51353MmE.A03.setText(c214499en.A09);
                        C38321qM c38321qM = c214499en.A00;
                        ImageView imageView = c51353MmE.A02;
                        if (c38321qM != null) {
                            AbstractC38055Goi.A00(imageView, c38321qM.A1S(), null);
                            imageView.setVisibility(0);
                            c51353MmE.A06.setVisibility(8);
                            c51353MmE.A07.setVisibility(8);
                        } else {
                            imageView.setVisibility(8);
                            c51353MmE.A06.setVisibility(0);
                            c51353MmE.A07.setVisibility(0);
                        }
                        A01 = c51353MmE.A08.A01();
                        AbstractC66174U2p.A00(A01);
                        A00 = new ViewOnClickListenerC55464OkJ(32, c214499en, c51353MmE);
                    } else {
                        InterfaceC62602sz interfaceC62602sz = this.A0C;
                        C14360o3.A0B(interfaceC62602sz, 0);
                        ((C51237MkM) c3oo).A00.A04(interfaceC62602sz, null);
                        return;
                    }
                } else {
                    str = c54666OCs.A03;
                    str.getClass();
                    textView = ((C51236MkL) c3oo).A00;
                }
            } else {
                str = c54666OCs.A04;
                str.getClass();
                textView = ((C51238MkN) c3oo).A00;
            }
            textView.setText(str);
            return;
        }
        C51357MmI c51357MmI = (C51357MmI) c3oo;
        User user = c54666OCs.A02;
        user.getClass();
        InterfaceC11380iw interfaceC11380iw = this.A08;
        ViewGroup viewGroup2 = c51357MmI.A06;
        viewGroup2.setBackground(null);
        ViewOnClickListenerC55464OkJ.A01(viewGroup2, 33, user, c51357MmI);
        TextView textView2 = c51357MmI.A09;
        AbstractC31173DnH.A1F(textView2, user);
        int i3 = c51357MmI.A04;
        textView2.setTextColor(i3);
        boolean isVerified = user.isVerified();
        DisplayMetrics displayMetrics = AbstractC25228BEl.A0M(textView2).getDisplayMetrics();
        RectF rectF = AbstractC13880nE.A01;
        C85963sQ.A09(textView2, (int) TypedValue.applyDimension(1, 1.0f, displayMetrics), 0, i3, isVerified);
        c51357MmI.A08.setText(user.getFullName());
        String Bhe = user.A03.Bhe();
        TextView textView3 = c51357MmI.A07;
        if (Bhe != null) {
            textView3.setText(user.A03.Bhe());
        } else {
            textView3.setVisibility(8);
        }
        IgImageView igImageView = c51357MmI.A0A;
        AbstractC31173DnH.A1T(interfaceC11380iw, igImageView, user);
        igImageView.setVisibility(0);
        C57012jc c57012jc = c51357MmI.A0B;
        c57012jc.A03(0);
        A01 = c57012jc.A01();
        AbstractC66174U2p.A00(A01);
        A00 = ViewOnClickListenerC55459OkE.A00(c51357MmI, interfaceC11380iw, user, 8);
        C0fQ.A00(A00, A01);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0052, code lost:
    
        if (((X.C171907lL) r5.A01(X.C171907lL.class, X.C171897lK.A00)).A00 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C51162Mj5(android.app.Activity r3, X.InterfaceC11380iw r4, com.instagram.common.session.UserSession r5, X.C56247Oxu r6, X.C56247Oxu r7, X.InterfaceC62602sz r8, java.lang.Boolean r9, java.lang.String r10) {
        /*
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = X.AbstractC166987dD.A1E()
            r2.A0H = r0
            java.util.ArrayList r0 = X.AbstractC166987dD.A1E()
            r2.A05 = r0
            java.util.ArrayList r0 = X.AbstractC166987dD.A1E()
            r2.A06 = r0
            java.util.ArrayList r0 = X.AbstractC166987dD.A1E()
            r2.A04 = r0
            java.util.ArrayList r0 = X.AbstractC166987dD.A1E()
            r2.A03 = r0
            java.util.ArrayList r0 = X.AbstractC166987dD.A1E()
            r2.A02 = r0
            r2.A07 = r3
            r2.A0C = r8
            r2.A0A = r6
            r2.A0D = r9
            r2.A0B = r7
            r2.A0F = r10
            r2.A09 = r5
            r2.A08 = r4
            java.lang.String r0 = "PRE_LIVE"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L54
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            X.7lK r1 = X.C171897lK.A00
            java.lang.Class<X.7lL> r0 = X.C171907lL.class
            java.lang.Object r0 = r5.A01(r0, r1)
            X.7lL r0 = (X.C171907lL) r0
            X.7lJ r1 = r0.A00
            r0 = 2131963000(0x7f132c78, float:1.9562741E38)
            if (r1 != 0) goto L57
        L54:
            r0 = 2131963001(0x7f132c79, float:1.9562743E38)
        L57:
            java.lang.String r0 = r3.getString(r0)
            r2.A0G = r0
            r0 = 2131962999(0x7f132c77, float:1.956274E38)
            java.lang.String r0 = r3.getString(r0)
            r2.A0E = r0
            r2.A01()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51162Mj5.<init>(android.app.Activity, X.0iw, com.instagram.common.session.UserSession, X.Oxu, X.Oxu, X.2sz, java.lang.Boolean, java.lang.String):void");
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1098385604);
        int size = this.A0H.size();
        C0f9.A0A(-690056704, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int A03 = C0f9.A03(-860048185);
        int i2 = ((C54666OCs) this.A0H.get(i)).A00;
        C0f9.A0A(-1387232912, A03);
        return i2;
    }
}

package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.Jdo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44063Jdo extends BaseAdapter {
    public int A00;
    public final View A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final C1810981l A04;
    public final C8NZ A05;
    public final List A06;
    public final List A07;
    public final boolean A08;
    public final AbstractC150216pT A09;
    public final Map A0A;

    public final void A02(L10 l10, boolean z) {
        C14360o3.A0B(l10, 0);
        EnumC46196KcY enumC46196KcY = l10.A00;
        if (enumC46196KcY != null) {
            int ordinal = enumC46196KcY.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1 || ordinal == 2) {
                    return;
                }
            } else {
                Object obj = this.A0A.get(l10.A01);
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.StickerEmojiSheetViewBinder.Holder");
                ((C47538Kz6) obj).A01.EMV(z);
                return;
            }
        }
        throw AbstractC166987dD.A1D("Unknown asset sheet type");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 2;
    }

    public final boolean A03(L10 l10) {
        EnumC46196KcY enumC46196KcY = l10.A00;
        if (enumC46196KcY != null) {
            int ordinal = enumC46196KcY.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1 || ordinal == 2) {
                    return true;
                }
            } else {
                Object obj = this.A0A.get(l10.A01);
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.StickerEmojiSheetViewBinder.Holder");
                return ((C47538Kz6) obj).A01.CQ6();
            }
        }
        throw AbstractC166987dD.A1D("Unknown asset sheet type");
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.A07.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.A07.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return ((L10) this.A07.get(i)).A01.hashCode();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        EnumC46196KcY enumC46196KcY = ((L10) this.A07.get(i)).A00;
        if (enumC46196KcY != null) {
            int ordinal = enumC46196KcY.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1 || ordinal == 2) {
                    return 1;
                }
            } else {
                return 0;
            }
        }
        throw AbstractC166987dD.A1D("Unknown asset sheet type");
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        List list;
        Object c47538Kz6;
        View view2 = view;
        C14360o3.A0B(viewGroup, 2);
        if (view == null) {
            if (getItemViewType(i) != 0) {
                Context A0L = AbstractC166997dE.A0L(viewGroup);
                UserSession userSession = this.A03;
                InterfaceC11380iw interfaceC11380iw = this.A02;
                C1810981l c1810981l = this.A04;
                C8NZ c8nz = this.A05;
                C14360o3.A0B(userSession, 1);
                AbstractC167007dF.A1G(interfaceC11380iw, 2, c8nz);
                view2 = AbstractC31173DnH.A0C(LayoutInflater.from(A0L), viewGroup, R.layout.layout_fading_edge_listview, false);
                c47538Kz6 = new Kz5(view2, interfaceC11380iw, userSession, c1810981l, c8nz);
            } else {
                Context A0L2 = AbstractC166997dE.A0L(viewGroup);
                UserSession userSession2 = this.A03;
                View view3 = this.A01;
                InterfaceC11380iw interfaceC11380iw2 = this.A02;
                C8NZ c8nz2 = this.A05;
                boolean z = this.A08;
                C1810981l c1810981l2 = this.A04;
                boolean A1Y = AbstractC25229BEm.A1Y(userSession2);
                C14360o3.A0B(view3, 2);
                AbstractC167007dF.A1G(interfaceC11380iw2, 3, c8nz2);
                view2 = LayoutInflater.from(A0L2).inflate(R.layout.layout_fading_edge_recyclerview, viewGroup, A1Y);
                AbstractC43592JPx.A1T(view2);
                C3FQ A00 = C3FN.A00((ViewGroup) view2);
                C14360o3.A07(A00);
                c47538Kz6 = new C47538Kz6(A0L2, (ViewGroup) view3, interfaceC11380iw2, userSession2, c1810981l2, c8nz2, A00, AbstractC43594JPz.A03(A0L2), z);
            }
            view2.setTag(c47538Kz6);
        }
        UserSession userSession3 = this.A03;
        C447324d c447324d = AnonymousClass229.A01(userSession3).A01;
        C14360o3.A07(c447324d);
        if (!c447324d.A02 && c447324d.A03) {
            C24Q c24q = c447324d.A04;
            c24q.A0C("ui_load_start", c447324d.A00);
            c24q.A09(c447324d.A00, "camera_destination", String.valueOf(c447324d.A05.A00.A0J()));
            c447324d.A02 = true;
        }
        List list2 = this.A06;
        if (AbstractC166987dD.A1b(list2)) {
            int itemViewType = getItemViewType(i);
            list = this.A07;
            A00(view2, (L10) list.get(i), list2, itemViewType);
        } else {
            int itemViewType2 = getItemViewType(i);
            list = this.A07;
            A00(view2, (L10) list.get(i), C16930sl.A00, itemViewType2);
        }
        C66049Tym c66049Tym = new C66049Tym(view2, new B61(5, c447324d, this), AbstractC209779Pn.A00(userSession3));
        if (i == AbstractC25226BEj.A05(list)) {
            c66049Tym.A00();
        }
        return view2;
    }

    public C44063Jdo(View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C1810981l c1810981l, C8NZ c8nz, AbstractC150216pT abstractC150216pT, boolean z, boolean z2) {
        AbstractC167027dH.A13(userSession, view, interfaceC11380iw);
        C14360o3.A0B(c8nz, 5);
        this.A03 = userSession;
        this.A01 = view;
        this.A02 = interfaceC11380iw;
        this.A09 = abstractC150216pT;
        this.A05 = c8nz;
        this.A08 = z;
        this.A04 = c1810981l;
        this.A06 = AbstractC166987dD.A1E();
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A07 = A1E;
        this.A0A = AbstractC166987dD.A1G();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        if (!z2) {
            A1E2.add(C148276lx.A1d);
            A1E2.add(C148276lx.A1c);
        }
        A1E.add(AbstractC46683Kl0.A00(A1E2));
        this.A00 = A1E.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void A00(View view, L10 l10, List list, int i) {
        C47538Kz6 c47538Kz6;
        Object tag = view.getTag();
        if (i != 0) {
            C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.RecentSheetViewBinder.Holder");
            Kz5 kz5 = (Kz5) tag;
            AbstractC150216pT abstractC150216pT = this.A09;
            if (abstractC150216pT != null) {
                ArrayList A02 = abstractC150216pT.A02();
                C14360o3.A0B(kz5, 0);
                KEB keb = kz5.A00;
                List list2 = keb.A03;
                list2.clear();
                list2.addAll(A02);
                keb.A06();
                keb.A08(keb.A02, new C45127Jxw((C45127Jxw) null, AbstractC166997dE.A0p(keb.A00, 2131971550)));
                int ceil = (int) Math.ceil(list2.size() / 4.0d);
                for (int i2 = 0; i2 < ceil; i2++) {
                    C153126ug c153126ug = new C153126ug(list2, i2 * 4, 4);
                    C153336v2 A0G = AbstractC37304Gc5.A0G(AbstractC166997dE.A0u(c153126ug), keb.A04);
                    A0G.A00(i2, AbstractC167007dF.A1P(i2, ceil - 1));
                    keb.A09(keb.A01, new C47537Kz4(c153126ug, 4), A0G);
                }
                keb.A07();
                c47538Kz6 = kz5;
            } else {
                throw AbstractC166997dE.A0g();
            }
        } else {
            C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.StickerEmojiSheetViewBinder.Holder");
            C47538Kz6 c47538Kz62 = (C47538Kz6) tag;
            AbstractC167017dG.A1N(c47538Kz62, l10);
            boolean A04 = AnonymousClass483.A04(list);
            C215249g0 c215249g0 = c47538Kz62.A00;
            if (!A04) {
                c215249g0.A01 = list;
            } else {
                List list3 = l10.A02;
                List list4 = c215249g0.A0F;
                list4.clear();
                list4.addAll(list3);
            }
            C215249g0.A01(c215249g0);
            c47538Kz6 = c47538Kz62;
        }
        this.A0A.put(l10.A01, c47538Kz6);
    }

    public final int A01(int i, int i2) {
        C47538Kz6 c47538Kz6;
        View AnU;
        Object item = getItem(i2);
        C14360o3.A0C(item, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.model.StickerSet");
        Object obj = this.A0A.get(((L10) item).A01);
        if ((obj instanceof C47538Kz6) && (c47538Kz6 = (C47538Kz6) obj) != null && (AnU = c47538Kz6.A01.AnU(i)) != null) {
            return AnU.getHeight();
        }
        return 0;
    }
}

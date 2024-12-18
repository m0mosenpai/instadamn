package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes5.dex */
public final class BZ4 extends BaseAdapter {
    public Context A00;
    public C3W4 A01;
    public UserSession A02;
    public C4hj A03;
    public C101024gI A04;
    public C41S A05;
    public C105214ob A06;
    public C41X A07;
    public C38321qM A08;
    public C75113Zb A09;
    public C33P A0A;
    public Boolean A0B;
    public HashMap A0C;
    public HashMap A0D;
    public HashMap A0E;
    public List A0F;
    public final InterfaceC60442pS A0G;

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 3;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.A0F.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.A0F.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Object A00;
        View view2 = view;
        if (view == null) {
            if (getItemViewType(i) != 1) {
                C41X c41x = this.A07;
                Context context = this.A00;
                C14360o3.A0B(context, 0);
                view2 = LayoutInflater.from(context).inflate(R.layout.row_feed_carousel_media_video, viewGroup, false);
                C14360o3.A0A(view2);
                A00 = C41Y.A00(context, view2, c41x.A01, null, null);
            } else {
                C41S c41s = this.A05;
                Context context2 = this.A00;
                C14360o3.A0B(context2, 0);
                view2 = LayoutInflater.from(context2).inflate(R.layout.row_feed_carousel_media_image, viewGroup, false);
                C14360o3.A0A(view2);
                A00 = C41T.A00(view2, c41s.A00, null, null);
            }
            view2.setTag(A00);
        }
        if (getItemViewType(i) != 1) {
            C75113Zb c75113Zb = this.A09;
            int i2 = c75113Zb.A02;
            List list = this.A0F;
            C38321qM c38321qM = (C38321qM) list.get(i2);
            C105214ob c105214ob = this.A06;
            if (c105214ob == null) {
                c105214ob = new C105214ob(this.A02, this.A03, null);
                this.A06 = c105214ob;
            }
            C38321qM c38321qM2 = this.A08;
            C33P c33p = this.A0A;
            EnumC74373Vt A02 = c33p.A02(c38321qM);
            EnumC79303gb enumC79303gb = EnumC79303gb.A02;
            C38321qM A0x = AbstractC25225BEi.A0x(list, i);
            HashMap hashMap = this.A0D;
            HashMap hashMap2 = this.A0C;
            HashMap hashMap3 = this.A0E;
            Context context3 = this.A00;
            InterfaceC60442pS interfaceC60442pS = this.A0G;
            C105224oc A002 = c105214ob.A00(context3, c38321qM2, A0x, interfaceC60442pS, c75113Zb, enumC79303gb, A02, null, null, list, hashMap, hashMap2, hashMap3, i, 0, true);
            C41X c41x2 = this.A07;
            C3W4 c3w4 = this.A01;
            AbstractC25233BEq.A0w(2, c75113Zb, c3w4, interfaceC60442pS);
            C41Y c41y = C41X.A06;
            Context context4 = c41x2.A00;
            UserSession userSession = c41x2.A01;
            boolean z = c41x2.A04;
            boolean z2 = c41x2.A05;
            View view3 = view2;
            c41y.A02(context4, view3, c3w4, userSession, c41x2.A02, A002, c41x2.A03, interfaceC60442pS, c75113Zb, z, z2);
            if (i == i2) {
                Object tag = view2.getTag();
                tag.getClass();
                c33p.A07(c38321qM, (C3Y7) tag, c75113Zb);
            }
            return view2;
        }
        List list2 = this.A0F;
        C5H8 BHc = AbstractC25225BEi.A0x(list2, list2.size() - 1).A0C.BHc();
        C101024gI c101024gI = this.A04;
        if (c101024gI == null) {
            c101024gI = new C101024gI(this.A02, this.A03, null);
            this.A04 = c101024gI;
        }
        C38321qM c38321qM3 = this.A08;
        C75113Zb c75113Zb2 = this.A09;
        boolean booleanValue = this.A0B.booleanValue();
        Context context5 = this.A00;
        InterfaceC60442pS interfaceC60442pS2 = this.A0G;
        C101044gK A003 = c101024gI.A00(context5, c38321qM3, interfaceC60442pS2, c75113Zb2, null, null, list2, this.A0D, this.A0C, this.A0E, 0, i, true, false, false, booleanValue);
        UserSession userSession2 = this.A02;
        C4hj c4hj = this.A03;
        C41S.A01.A02(context5, view2, BHc, userSession2, c4hj, c4hj, A003, interfaceC60442pS2, interfaceC60442pS2, c75113Zb2);
        return view2;
    }

    public BZ4(Context context, C3W4 c3w4, UserSession userSession, C4hj c4hj, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, C33P c33p, Boolean bool, HashMap hashMap, HashMap hashMap2, HashMap hashMap3, List list) {
        this.A00 = context;
        this.A08 = c38321qM;
        this.A0G = interfaceC60442pS;
        this.A0B = bool;
        this.A09 = c75113Zb;
        this.A05 = new C41S(userSession);
        this.A07 = new C41X(context, userSession, c4hj, c4hj, false, false);
        this.A0D = hashMap;
        this.A0C = hashMap2;
        this.A0E = hashMap3;
        this.A0F = list;
        this.A0A = c33p;
        this.A03 = c4hj;
        this.A01 = c3w4;
        this.A02 = userSession;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        ((C38321qM) getItem(i)).getId().getClass();
        return r0.hashCode();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        if (((C38321qM) getItem(i)).BRp() != EnumC40111tc.A0a) {
            return 1;
        }
        return 2;
    }
}

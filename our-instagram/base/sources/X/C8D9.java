package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.creation.capture.quickcapture.colourpicker.ColorPalette;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8D9, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8D9 {
    public ReboundViewPager A00;
    public C8DB A01;
    public CirclePageIndicator A02;
    public List A03;
    public InterfaceC09390do A04;
    public final UserSession A05;
    public final ArrayList A06;
    public final C57312k6 A07;

    public C8D9(View view, C07T c07t, UserSession userSession, C8D4 c8d4) {
        List list;
        C14360o3.A0B(view, 1);
        C14360o3.A0B(c07t, 4);
        this.A05 = userSession;
        this.A06 = new ArrayList();
        if (C18U.A06(C06090Tz.A06, userSession, 36331046752502925L)) {
            list = C8DA.A04;
        } else {
            list = C8DA.A03;
        }
        this.A03 = list;
        this.A07 = AbstractC57302k5.A00(c07t);
        this.A00 = (ReboundViewPager) view.requireViewById(R.id.colour_palette_pager);
        Context context = view.getContext();
        C14360o3.A07(context);
        C8DB c8db = new C8DB(context, userSession, c8d4, this.A03);
        this.A01 = c8db;
        this.A00.setAdapter(c8db);
        this.A00.A0J = new C3Vd() { // from class: X.8DJ
            @Override // X.C3Vd, X.InterfaceC74243Ve
            public final boolean F83(ReboundViewPager reboundViewPager, float f, float f2) {
                View view2 = reboundViewPager.A0F;
                C14360o3.A0C(view2, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.colourpicker.ColorPalette");
                ColorPalette colorPalette = (ColorPalette) view2;
                if (f2 >= colorPalette.A01 && f2 <= colorPalette.A00) {
                    return true;
                }
                return false;
            }
        };
        CirclePageIndicator circlePageIndicator = (CirclePageIndicator) view.requireViewById(R.id.colour_palette_pager_indicator);
        this.A02 = circlePageIndicator;
        circlePageIndicator.A01(0, 3);
        this.A00.A0P(this.A02);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.0oO, java.lang.Object] */
    public final void A03(boolean z, boolean z2) {
        Object value;
        C18U.A06(C06090Tz.A05, this.A05, 36331046752502925L);
        ?? obj = new Object();
        if (z2) {
            if (this.A04 == null) {
                ArrayList arrayList = this.A06;
                if (!arrayList.isEmpty()) {
                    A01(this.A03);
                    if (!arrayList.isEmpty()) {
                        A00(C8DC.A00(arrayList));
                    }
                }
            }
            A01(this.A03);
            InterfaceC09390do interfaceC09390do = this.A04;
            if (interfaceC09390do != null && (value = interfaceC09390do.getValue()) != null) {
                AbstractC23641Du.A03(C05F.A00, C12L.A00.AOT(-18, 3), new C9DJ(this, obj, value, null, 3, z), this.A07);
            }
            this.A04 = null;
        }
        if (!obj.A00) {
            AbstractC125325le.A04(null, new View[]{this.A00, this.A02}, z);
        }
    }

    public final void A00(ArrayList arrayList) {
        C8DB c8db = this.A01;
        c8db.A02.add(0, arrayList);
        C0fA.A00(c8db, 1695962476);
        this.A02.setPageCount(c8db.getCount());
        this.A00.A0K(0);
        c8db.A01 = true;
    }

    public final void A01(List list) {
        this.A03 = list;
        C8DB c8db = this.A01;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C8DC.A00((ArrayList) it.next()));
            }
            if (!arrayList.isEmpty()) {
                List list2 = c8db.A02;
                list2.clear();
                list2.addAll(arrayList);
                C0fA.A00(c8db, 614419318);
                this.A02.setPageCount(c8db.getCount());
                return;
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public final void A02(boolean z) {
        AbstractC125325le.A05(new View[]{this.A00, this.A02}, z);
    }
}

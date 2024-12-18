package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager;
import com.instagram.discovery.recyclerview.ui.DiscoveryRecyclerView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.TzQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66089TzQ {
    public final int A00;
    public final Activity A01;
    public final UserSession A02;
    public final C66092TzT A03;
    public final C66090TzR A04;
    public final C66091TzS A05;

    public C66089TzQ(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C66088TzP c66088TzP, int i) {
        C14360o3.A0B(userSession, 2);
        this.A01 = activity;
        this.A02 = userSession;
        this.A00 = i;
        this.A04 = new C66090TzR(c66088TzP);
        this.A05 = new C66091TzS(interfaceC11380iw, userSession);
        this.A03 = new C66092TzT(activity, c66088TzP);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A00() {
        Object c68040V7r;
        DiscoveryRecyclerView discoveryRecyclerView;
        C2UU c2uu;
        FlowingGridLayoutManager flowingGridLayoutManager;
        int i;
        View view;
        String A2u;
        boolean z;
        User CDj;
        View view2;
        C66090TzR c66090TzR = this.A04;
        long currentTimeMillis = System.currentTimeMillis();
        long j = c66090TzR.A00;
        if (j != -1 && currentTimeMillis - j < 1000) {
            c68040V7r = new C68040V7r(true);
        } else {
            c66090TzR.A00 = System.currentTimeMillis();
            C38P c38p = c66090TzR.A01.A00;
            C65823Tug c65823Tug = c38p.A06;
            if (c65823Tug != null) {
                if (!AbstractC167007dF.A1W(c65823Tug.A0E.A06) && (discoveryRecyclerView = c65823Tug.A04) != null && (c2uu = discoveryRecyclerView.A0A) != null && c2uu.getItemCount() != 0 && discoveryRecyclerView.getChildCount() != 0 && ((C38086GpF) c38p.A0q.getValue()).A01.A03.size() > 1) {
                    c68040V7r = C68041V7s.A00;
                } else {
                    c68040V7r = new C68040V7r(false);
                }
            }
            C14360o3.A0F("grid");
            throw C00O.createAndThrow();
        }
        if (c68040V7r instanceof C68040V7r) {
            if (((C68040V7r) c68040V7r).A00) {
                return;
            }
        } else {
            if (c68040V7r instanceof C68041V7s) {
                C66091TzS c66091TzS = this.A05;
                C19280xC A00 = C19280xC.A00(c66091TzS.A00, AbstractC111324zv.A00(109));
                A00.A0C("nav_chain", C1QM.A00.A02.A00);
                AbstractC31173DnH.A1S(A00, c66091TzS.A01);
                C66092TzT c66092TzT = this.A03;
                C38P c38p2 = c66092TzT.A01.A00;
                C65823Tug c65823Tug2 = c38p2.A06;
                if (c65823Tug2 != null) {
                    DiscoveryRecyclerView discoveryRecyclerView2 = c65823Tug2.A04;
                    if (discoveryRecyclerView2 != null) {
                        AbstractC70663Fe abstractC70663Fe = discoveryRecyclerView2.A0D;
                        if ((abstractC70663Fe instanceof FlowingGridLayoutManager) && (flowingGridLayoutManager = (FlowingGridLayoutManager) abstractC70663Fe) != null) {
                            Activity activity = c66092TzT.A00;
                            int A1a = flowingGridLayoutManager.A1a();
                            int i2 = A1a + 12;
                            while (true) {
                                if (A1a >= i2) {
                                    break;
                                }
                                C3OO A0V = discoveryRecyclerView2.A0V(A1a);
                                if (A0V != null && (A0V instanceof C38160GqR)) {
                                    int height = (A0V.itemView.getHeight() * 4) + (activity.getResources().getDimensionPixelSize(R.dimen.photo_grid_spacing) * 3);
                                    if (height != -1) {
                                        int width = discoveryRecyclerView2.getWidth();
                                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                                        Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
                                        C14360o3.A07(createBitmap);
                                        Canvas canvas = new Canvas(createBitmap);
                                        canvas.drawColor(activity.getColor(R.color.direct_widget_primary_background));
                                        int A1a2 = flowingGridLayoutManager.A1a();
                                        if (A1a2 != -1) {
                                            List list = ((C38086GpF) c66092TzT.A02.A00.A00.A0q.getValue()).A01.A03;
                                            Iterator it = list.iterator();
                                            int i3 = 0;
                                            int i4 = -1;
                                            loop1: while (true) {
                                                if (it.hasNext()) {
                                                    int i5 = i3 + 1;
                                                    Iterator it2 = ((C128005qU) it.next()).A02.iterator();
                                                    while (it2.hasNext()) {
                                                        it2.next();
                                                        i4++;
                                                        if (A1a2 == i4) {
                                                            break loop1;
                                                        }
                                                    }
                                                    i3 = i5;
                                                } else {
                                                    i3 = -1;
                                                    break;
                                                }
                                            }
                                            Iterator it3 = list.iterator();
                                            int i6 = -1;
                                            int i7 = 0;
                                            loop3: while (true) {
                                                if (!it3.hasNext()) {
                                                    break;
                                                }
                                                int i8 = i7 + 1;
                                                for (AbstractC127945qN abstractC127945qN : ((C128005qU) it3.next()).A02) {
                                                    i6++;
                                                    C3OO A0V2 = discoveryRecyclerView2.A0V(i6);
                                                    if (A0V2 != null) {
                                                        view2 = A0V2.itemView;
                                                    } else {
                                                        view2 = null;
                                                    }
                                                    if (abstractC127945qN.A02.A04 > 1 && i7 == i3 && view2 != null && view2.getTop() < discoveryRecyclerView2.getTop()) {
                                                        i = -1;
                                                        Iterator it4 = list.iterator();
                                                        int i9 = 0;
                                                        loop5: while (it4.hasNext()) {
                                                            int i10 = i9 + 1;
                                                            Iterator it5 = ((C128005qU) it4.next()).A02.iterator();
                                                            while (it5.hasNext()) {
                                                                it5.next();
                                                                i++;
                                                                int i11 = i3 + 1;
                                                                if (i9 != i11) {
                                                                    if (i9 > i11) {
                                                                        break loop5;
                                                                    }
                                                                } else {
                                                                    break loop5;
                                                                }
                                                            }
                                                            i9 = i10;
                                                        }
                                                    }
                                                }
                                                i7 = i8;
                                            }
                                            i = A1a2;
                                            if (flowingGridLayoutManager.A0d(i) != null) {
                                                float f = -1.0f;
                                                canvas.translate(0.0f, r0.getTop() * (-1.0f));
                                                ArrayList arrayList = new ArrayList();
                                                int i12 = i + 12;
                                                for (int i13 = i; i13 < i12; i13++) {
                                                    C3OO A0V3 = discoveryRecyclerView2.A0V(i13);
                                                    if (A0V3 != 0 && (view = A0V3.itemView) != null) {
                                                        if ((!(A0V3 instanceof C38160GqR) || ((C38160GqR) A0V3).A00.A0N) && ((!(A0V3 instanceof C38164GqV) || ((C38164GqV) A0V3).A07.A0N) && !(A0V3 instanceof C65912TwJ))) {
                                                            if (A0V3 instanceof InterfaceC58117Ppg) {
                                                                ((InterfaceC58117Ppg) A0V3).BGn().setVisibility(0);
                                                            }
                                                            float left = view.getLeft();
                                                            float top = view.getTop();
                                                            if (i13 == i) {
                                                                f = top;
                                                            }
                                                            if (A0V3 instanceof C38524Gwk) {
                                                                view = ((C38524Gwk) A0V3).A0G;
                                                            }
                                                            if (view.getBottom() > discoveryRecyclerView2.getHeight() || view.getTop() < discoveryRecyclerView2.getTop()) {
                                                                int width2 = view.getWidth();
                                                                int height2 = view.getHeight();
                                                                AbstractC65702TsY.A12(view, height2, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO, View.MeasureSpec.makeMeasureSpec(width2, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO));
                                                                view.layout(0, 0, width2, height2);
                                                            }
                                                            Bitmap createBitmap2 = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
                                                            C14360o3.A07(createBitmap2);
                                                            view.draw(new Canvas(createBitmap2));
                                                            InterfaceC09390do interfaceC09390do = c38p2.A0q;
                                                            InterfaceC127955qO interfaceC127955qO = (AbstractC127945qN) ((C38086GpF) interfaceC09390do.getValue()).A01.A02.get(i13);
                                                            boolean z2 = false;
                                                            if ((interfaceC127955qO instanceof InterfaceC127975qQ) && (CDj = ((InterfaceC127975qQ) interfaceC127955qO).BQN().A0C.CDj()) != null) {
                                                                z2 = AbstractC166997dE.A1Z(CDj.A0J(), true);
                                                            }
                                                            if (z2) {
                                                                createBitmap2 = BlurUtil.blur(createBitmap2, 0.1f, 6);
                                                                Drawable drawable = activity.getDrawable(R.drawable.instagram_eye_off_pano_outline_32);
                                                                if (drawable != null) {
                                                                    int width3 = (createBitmap2.getWidth() - drawable.getIntrinsicWidth()) / 2;
                                                                    int height3 = (createBitmap2.getHeight() - drawable.getIntrinsicHeight()) / 2;
                                                                    Canvas canvas2 = new Canvas(createBitmap2);
                                                                    drawable.mutate();
                                                                    drawable.setColorFilter(-1, PorterDuff.Mode.SRC_IN);
                                                                    drawable.setBounds(width3, height3, drawable.getIntrinsicWidth() + width3, drawable.getIntrinsicHeight() + height3);
                                                                    drawable.draw(canvas2);
                                                                }
                                                            }
                                                            canvas.drawBitmap(createBitmap2, left, top, (Paint) null);
                                                            InterfaceC127955qO interfaceC127955qO2 = (AbstractC127945qN) ((C38086GpF) interfaceC09390do.getValue()).A01.A02.get(i13);
                                                            if ((interfaceC127955qO2 instanceof InterfaceC127975qQ) && (A2u = ((InterfaceC127975qQ) interfaceC127955qO2).BQN().A2u()) != null && A2u.length() != 0) {
                                                                boolean A1P = AbstractC25230BEn.A1P(((top - f) > createBitmap.getHeight() ? 1 : ((top - f) == createBitmap.getHeight() ? 0 : -1)));
                                                                C38086GpF c38086GpF = (C38086GpF) interfaceC09390do.getValue();
                                                                InterfaceC127955qO interfaceC127955qO3 = (AbstractC127945qN) c38086GpF.A01.A02.get(i13);
                                                                if (interfaceC127955qO3 instanceof InterfaceC127975qQ) {
                                                                    z = C3YS.A00(c38086GpF.A00).A05(((InterfaceC127975qQ) interfaceC127955qO3).BQN());
                                                                } else {
                                                                    z = false;
                                                                }
                                                                if (A1P && !z) {
                                                                    arrayList.add(A2u);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                String A002 = AbstractC196848nE.A00(System.currentTimeMillis());
                                                C14360o3.A07(A002);
                                                UserSession userSession = this.A02;
                                                String A03 = C50472Tr.A03(userSession, A002);
                                                Activity activity2 = this.A01;
                                                AbstractC70197WGf.A04(activity2, createBitmap, new C70817Wha(createBitmap, this, C197098ne.A04(createBitmap, userSession, C50472Tr.A02(activity2, false), A03, null).getCanonicalPath(), arrayList), C50472Tr.A02(activity2, false), -1);
                                                return;
                                            }
                                        }
                                    }
                                } else {
                                    A1a++;
                                }
                            }
                        }
                    }
                }
                C14360o3.A0F("grid");
                throw C00O.createAndThrow();
            }
            throw new RuntimeException();
        }
        C146106i8 c146106i8 = new C146106i8();
        c146106i8.A0D = this.A01.getString(2131964635);
        c146106i8.A05();
        c146106i8.A0H = "invalid_explore_grid_error";
        AbstractC25233BEq.A1F(c146106i8);
    }
}

package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ViewFlipper;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Oyj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56274Oyj implements InterfaceC58282Psa {
    public int A00;
    public int A01;
    public ViewFlipper A02;
    public ViewOnClickListenerC44797JsK A03;
    public final UserSession A04;
    public final P02 A05;
    public final C56238Oxl A06 = new C56238Oxl(this);

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC58282Psa
    public final void AQM(float f) {
    }

    @Override // X.InterfaceC58282Psa
    public final void COD(ViewGroup viewGroup) {
        Context A06 = AbstractC31173DnH.A06(viewGroup, 0);
        this.A02 = (ViewFlipper) LayoutInflater.from(A06).inflate(R.layout.filter_view_flipper, viewGroup).requireViewById(R.id.filter_view_flipper);
        ViewGroup A0C = AbstractC31176DnK.A0C(AbstractC25227BEk.A0C(LayoutInflater.from(A06), R.layout.bottom_sheet_filter_view), R.id.filters_container);
        float f = RecyclerView.A1E;
        C14360o3.A07(A06);
        ViewOnClickListenerC44797JsK viewOnClickListenerC44797JsK = new ViewOnClickListenerC44797JsK(A06);
        this.A03 = viewOnClickListenerC44797JsK;
        AbstractC43593JPy.A1B(viewOnClickListenerC44797JsK, -1);
        ViewOnClickListenerC44797JsK viewOnClickListenerC44797JsK2 = this.A03;
        if (viewOnClickListenerC44797JsK2 != null) {
            viewOnClickListenerC44797JsK2.setClipChildren(false);
            if (this.A03 != null) {
                UserSession userSession = this.A04;
                AbstractC53887NsJ.A00(userSession);
                ViewOnClickListenerC44797JsK viewOnClickListenerC44797JsK3 = this.A03;
                if (viewOnClickListenerC44797JsK3 != null) {
                    viewOnClickListenerC44797JsK3.setBlurIconCache(C50713MaC.A00(userSession));
                    ViewOnClickListenerC44797JsK viewOnClickListenerC44797JsK4 = this.A03;
                    if (viewOnClickListenerC44797JsK4 != null) {
                        viewOnClickListenerC44797JsK4.A05 = true;
                        viewOnClickListenerC44797JsK4.A06 = true;
                        viewOnClickListenerC44797JsK4.A02 = this.A06;
                        P02 p02 = this.A05;
                        List list = p02.A01;
                        viewOnClickListenerC44797JsK4.setEffects(list, false, userSession);
                        ViewOnClickListenerC44797JsK viewOnClickListenerC44797JsK5 = this.A03;
                        if (viewOnClickListenerC44797JsK5 != null) {
                            A0C.addView(viewOnClickListenerC44797JsK5, 0);
                            ViewFlipper viewFlipper = this.A02;
                            if (viewFlipper != null) {
                                viewFlipper.addView(A0C, 0);
                                ViewFlipper viewFlipper2 = this.A02;
                                if (viewFlipper2 != null) {
                                    viewFlipper2.setDisplayedChild(0);
                                    ViewOnClickListenerC44797JsK viewOnClickListenerC44797JsK6 = this.A03;
                                    if (viewOnClickListenerC44797JsK6 != null) {
                                        List tileFrames = viewOnClickListenerC44797JsK6.getTileFrames();
                                        ArrayList A1E = AbstractC166987dD.A1E();
                                        for (Object obj : tileFrames) {
                                            if (MSX.A04((C44428Jkf) obj) != -1) {
                                                A1E.add(obj);
                                            }
                                        }
                                        ArrayList A0q = AbstractC167017dG.A0q(A1E);
                                        Iterator it = A1E.iterator();
                                        while (it.hasNext()) {
                                            C44428Jkf c44428Jkf = (C44428Jkf) it.next();
                                            A0q.add(new O7H(c44428Jkf, MSX.A04(c44428Jkf)));
                                        }
                                        C50713MaC.A00(userSession).A07(A06, A0q);
                                        int A08 = MSZ.A08(p02.A03);
                                        int A00 = AbstractC53889NsL.A00(list, A08);
                                        if (A00 > 0) {
                                            C22C A01 = AnonymousClass229.A01(userSession);
                                            if (A01.A0J() != null) {
                                                A01.A1B(AnonymousClass249.ALBUM, EnumC50631MWs.A0I, A08, A00);
                                            }
                                            this.A01 = A08;
                                        }
                                        ViewOnClickListenerC44797JsK viewOnClickListenerC44797JsK7 = this.A03;
                                        if (viewOnClickListenerC44797JsK7 != null) {
                                            ViewTreeObserver viewTreeObserver = viewOnClickListenerC44797JsK7.getViewTreeObserver();
                                            if (viewTreeObserver != null) {
                                                viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC55497Okq(this, A00, 2));
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                            C14360o3.A0F("viewContainer");
                            throw C00O.createAndThrow();
                        }
                    }
                }
            }
        }
        C14360o3.A0F("filterPicker");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58282Psa
    public final boolean CRk() {
        return true;
    }

    @Override // X.InterfaceC58282Psa
    public final boolean CRl() {
        return true;
    }

    @Override // X.InterfaceC58282Psa
    public final void D01() {
        this.A01 = 0;
        this.A00 = 0;
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC58282Psa
    public final void DHV(float f, float f2) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroyView() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    @Override // X.InterfaceC58282Psa
    public final void AJN() {
        this.A05.AJN();
    }

    @Override // X.InterfaceC58282Psa
    public final List Ben() {
        return AbstractC166987dD.A1J(EnumC53228NgQ.A03);
    }

    @Override // X.InterfaceC58282Psa
    public final void cancel() {
        Object obj;
        InterfaceC58189Pqv Arg;
        List list = this.A05.A01;
        Iterator it = list.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                break;
            } else {
                obj = it.next();
            }
        } while (((InterfaceC50490MQs) obj).BF3() != this.A00);
        InterfaceC50490MQs interfaceC50490MQs = (InterfaceC50490MQs) obj;
        if (interfaceC50490MQs != null && (Arg = interfaceC50490MQs.Arg()) != null) {
            Arg.Cvt(false);
        }
        ViewOnClickListenerC44797JsK viewOnClickListenerC44797JsK = this.A03;
        if (viewOnClickListenerC44797JsK == null) {
            C14360o3.A0F("filterPicker");
            throw C00O.createAndThrow();
        }
        int A00 = AbstractC53889NsL.A00(list, this.A01);
        C57242PbQ c57242PbQ = new C57242PbQ(this, 31);
        AbstractC70663Fe abstractC70663Fe = viewOnClickListenerC44797JsK.A0D;
        View view = null;
        if (abstractC70663Fe != null && abstractC70663Fe.A0d(A00) != null) {
            InterfaceC58110PpZ interfaceC58110PpZ = viewOnClickListenerC44797JsK.A02;
            if (interfaceC58110PpZ != null) {
                AbstractC70663Fe abstractC70663Fe2 = viewOnClickListenerC44797JsK.A0D;
                if (abstractC70663Fe2 != null) {
                    view = abstractC70663Fe2.A0d(A00);
                }
                C14360o3.A0C(view, AbstractC43591JPw.A00(182));
                interfaceC58110PpZ.DtE((C44428Jkf) view, false);
            }
            c57242PbQ.invoke();
            return;
        }
        viewOnClickListenerC44797JsK.A0o(A00);
        viewOnClickListenerC44797JsK.A14(new C51194Mje(viewOnClickListenerC44797JsK, c57242PbQ, A00));
    }

    public C56274Oyj(UserSession userSession, P02 p02) {
        this.A04 = userSession;
        this.A05 = p02;
    }
}

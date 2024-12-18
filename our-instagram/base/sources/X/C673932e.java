package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.32e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C673932e extends C1I7 implements InterfaceC60602pj {
    public C71133Gz A00;
    public int A01 = 0;
    public final InterfaceC11380iw A02;
    public final C57332k8 A03;
    public final List A04;
    public final Map A05;
    public final UserSession A06;

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
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

    @Override // X.InterfaceC60602pj
    public final void onDestroyView() {
        C71133Gz c71133Gz = this.A00;
        if (c71133Gz != null) {
            c71133Gz.A02.clear();
            InterfaceC59502nt interfaceC59502nt = c71133Gz.A00;
            if (interfaceC59502nt != null) {
                interfaceC59502nt.AGO();
            }
            c71133Gz.A00 = null;
        }
        this.A05.clear();
        this.A00 = null;
    }

    public C673932e(final Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C57332k8 c57332k8, boolean z) {
        Object obj;
        this.A02 = interfaceC11380iw;
        this.A03 = c57332k8;
        this.A06 = userSession;
        ArrayList arrayList = new ArrayList();
        this.A04 = arrayList;
        this.A05 = new HashMap();
        if (z) {
            obj = new C674032f(context, this);
        } else {
            obj = new AbstractC674232h() { // from class: X.6yY
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // X.AbstractC674232h
                public final void A01(Adapter adapter, int i) {
                    C673932e.A00(context, adapter, this, i);
                }
            };
        }
        arrayList.add(obj);
    }

    public static void A00(Context context, Adapter adapter, C673932e c673932e, int i) {
        Object item = adapter.getItem(i);
        if (item instanceof C38321qM) {
            C38321qM c38321qM = (C38321qM) item;
            C71133Gz c71133Gz = c673932e.A00;
            if (c38321qM.A55() && c71133Gz != null) {
                c71133Gz.A01(c38321qM.A1q(context));
                User A2E = c38321qM.A2E(c673932e.A06);
                if (A2E != null) {
                    C1OG A0J = C25821No.A00().A0J(A2E.Bhu(), c673932e.A02.getModuleName());
                    A0J.A0I = true;
                    A0J.A01();
                }
            }
        }
    }

    @Override // X.InterfaceC60602pj
    public final void D8S(View view) {
        C71133Gz c71133Gz = new C71133Gz(view.getContext());
        this.A00 = c71133Gz;
        c71133Gz.A01 = this.A02.getModuleName();
        ((ViewGroup) view).addView(this.A00, new ViewGroup.LayoutParams(1, 1));
        this.A00.setVisibility(8);
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        Object obj;
        int A03 = C0f9.A03(-598830410);
        ViewGroup CFj = c3fq.CFj();
        if (c3fq.CXX()) {
            obj = ((AdapterView) CFj).getAdapter();
        } else {
            obj = ((RecyclerView) CFj).A0A;
        }
        obj.getClass();
        Adapter adapter = (Adapter) obj;
        boolean z = false;
        if (i == 0) {
            z = true;
        }
        int B6q = c3fq.B6q();
        int i2 = this.A01;
        if (B6q > i2) {
            int i3 = 0;
            while (true) {
                List list = this.A04;
                if (i3 >= list.size()) {
                    break;
                }
                ((AbstractC674232h) list.get(i3)).A02(adapter, c3fq.BM3());
                i3++;
            }
        } else if (B6q < i2) {
            int i4 = 0;
            while (true) {
                List list2 = this.A04;
                if (i4 >= list2.size()) {
                    break;
                }
                ((AbstractC674232h) list2.get(i4)).A03(adapter, B6q);
                i4++;
            }
        }
        this.A01 = B6q;
        C71133Gz c71133Gz = this.A00;
        if (c71133Gz != null) {
            if (z) {
                c71133Gz.setEnabled(true);
                c71133Gz.A00();
            } else {
                c71133Gz.setEnabled(false);
            }
        }
        C0f9.A0A(1699123546, A03);
    }
}

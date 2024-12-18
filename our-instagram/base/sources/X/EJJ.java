package X;

import android.content.Context;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Currency;

/* loaded from: classes6.dex */
public final class EJJ extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "DirectThreadOrderFragment";
    public ImmutableList A00;
    public C66362zD A01;
    public C34541FKb A02;
    public String A03;
    public RecyclerView A04;
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC31175DnJ.A1I(interfaceC56362iU, getString(2131959122));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_thread_order_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String A0R;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C66392zG A0R2 = AbstractC31174DnI.A0R(this);
        InterfaceC09390do interfaceC09390do = this.A05;
        String A0t = AbstractC31173DnH.A0t(interfaceC09390do);
        String str2 = this.A03;
        if (str2 == null) {
            str = "consumerId";
        } else {
            this.A01 = AbstractC31173DnH.A0R(A0R2, new EXK(A0t, str2));
            RecyclerView A0F = AbstractC31176DnK.A0F(view);
            this.A04 = A0F;
            if (A0F == null) {
                AbstractC166987dD.A1T(C18950wb.A01, "DirectThreadOrderFragment - recycler view is null", 20134884);
            }
            RecyclerView recyclerView = this.A04;
            str = "recyclerView";
            if (recyclerView != null) {
                AbstractC31178DnM.A0z(this, recyclerView);
                RecyclerView recyclerView2 = this.A04;
                if (recyclerView2 != null) {
                    C66362zD c66362zD = this.A01;
                    if (c66362zD == null) {
                        str = "igRecyclerViewAdapter";
                    } else {
                        recyclerView2.setAdapter(c66362zD);
                        Context A0L = AbstractC166997dE.A0L(view);
                        String str3 = this.A03;
                        String str4 = "consumerId";
                        if (str3 != null) {
                            if (str3.length() > 0) {
                                C34541FKb c34541FKb = this.A02;
                                if (c34541FKb == null) {
                                    str4 = "logger";
                                } else {
                                    String A0t2 = AbstractC31173DnH.A0t(interfaceC09390do);
                                    String str5 = this.A03;
                                    if (str5 != null) {
                                        C14360o3.A0B(A0t2, 0);
                                        AbstractC31181DnP.A0v(c34541FKb.A01, "biig_order_management_all_orders_impression", A0t2, str5);
                                    }
                                }
                            }
                            ArrayList A1E = AbstractC166987dD.A1E();
                            ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
                            ImmutableList immutableList = this.A00;
                            if (immutableList == null) {
                                str4 = "orders";
                            } else {
                                C1LC it = immutableList.iterator();
                                C14360o3.A07(it);
                                while (it.hasNext()) {
                                    C2JS c2js = (C2JS) AbstractC166997dE.A0l(it);
                                    UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                                    C14360o3.A0B(c2js, 1);
                                    String A0b = AbstractC31177DnL.A0b(A0L, String.valueOf(c2js.A0C("order_id")), 2131959124);
                                    String optionalStringField = c2js.getOptionalStringField(0, "total_amount");
                                    Currency A03 = WFD.A03(A0r);
                                    C14360o3.A07(A03);
                                    if (optionalStringField == null) {
                                        A0R = "";
                                    } else {
                                        A0R = AnonymousClass001.A0R(A03.getSymbol(), optionalStringField);
                                    }
                                    int coercedIntField = c2js.getCoercedIntField(3, AbstractC111324zv.A00(5494));
                                    Calendar calendar = Calendar.getInstance();
                                    C14360o3.A07(calendar);
                                    calendar.setTimeInMillis((coercedIntField & 4294967295L) * 1000);
                                    String A0b2 = AbstractC31177DnL.A0b(A0L, DateFormat.format(AbstractC111324zv.A00(655), calendar).toString(), 2131959125);
                                    if ("Cancelled".equalsIgnoreCase(c2js.getOptionalStringField(6, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS))) {
                                        A0b2 = AnonymousClass001.A0g(A0b2, A0L.getString(2131961132), A0L.getString(2131959123));
                                    }
                                    A1E.add(new C36186Fy0(new C34542FKc(A0b, A0R, A0b2)));
                                }
                                A0E.A01(A1E);
                                C66362zD c66362zD2 = this.A01;
                                if (c66362zD2 == null) {
                                    str4 = "igRecyclerViewAdapter";
                                } else {
                                    c66362zD2.A05(A0E);
                                    return;
                                }
                            }
                        }
                        C14360o3.A0F(str4);
                        throw C00O.createAndThrow();
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        int A02 = C0f9.A02(235364373);
        super.onCreate(bundle);
        this.A02 = new C34541FKb(AbstractC166987dD.A0r(this.A05), "direct_thread_order_fragment");
        Bundle bundle2 = this.mArguments;
        String str = null;
        if (bundle2 != null) {
            serializable = bundle2.getSerializable("order_list");
        } else {
            serializable = null;
        }
        C14360o3.A0C(serializable, "null cannot be cast to non-null type com.google.common.collect.ImmutableList<com.instagram.direct.ordermanagement.graphql.IGP2MOrderManagementOrderListQueryResponse.XfbIgP2mGetOrders>");
        this.A00 = (ImmutableList) serializable;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            str = bundle3.getString("consumer_id");
        }
        String valueOf = String.valueOf(str);
        if (valueOf == null) {
            valueOf = "";
        }
        this.A03 = valueOf;
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            bundle4.remove("order_list");
        }
        C0f9.A09(-1007858657, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1414469637);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.direct_thread_order_view, viewGroup, false);
        C0f9.A09(-620186841, A02);
        return inflate;
    }
}

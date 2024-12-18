package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.R;
import com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public final class UCb extends LinearLayout implements X9f {
    public LinearLayout A00;
    public UvL A01;
    public Map A02;
    public final InterfaceC16660sJ A03;

    @Override // X.X9f
    public void setViewModel(UvL uvL) {
        VG3 vg3;
        C14360o3.A0B(uvL, 0);
        this.A01 = uvL;
        this.A00 = (LinearLayout) findViewById(R.id.address_list_container);
        this.A02 = new LinkedHashMap();
        InterfaceC16660sJ interfaceC16660sJ = this.A03;
        UvL uvL2 = this.A01;
        if (uvL2 != null) {
            UuL uuL = new UuL(uvL2.A01, interfaceC16660sJ, true);
            Map map = this.A02;
            String str = "viewBinders";
            if (map != null) {
                map.put(uuL.A02, uuL);
                UvL uvL3 = this.A01;
                if (uvL3 != null) {
                    C67646Uub c67646Uub = new C67646Uub(AbstractC166997dE.A0L(this), null, uvL3.A01, interfaceC16660sJ, X5Q.A00, null, true);
                    Map map2 = this.A02;
                    if (map2 != null) {
                        map2.put(((UGL) c67646Uub).A02, c67646Uub);
                        UvL uvL4 = this.A01;
                        if (uvL4 != null) {
                            if (!(uvL4.A05.A02() instanceof SelectionActionViewItem)) {
                                UvL uvL5 = this.A01;
                                if (uvL5 != null) {
                                    UuO uuO = new UuO(uvL5.A01, interfaceC16660sJ, true, uvL5.A03);
                                    Map map3 = this.A02;
                                    if (map3 != null) {
                                        map3.put(uuO.A02, uuO);
                                    }
                                }
                            }
                            UvL uvL6 = this.A01;
                            if (uvL6 == null) {
                                str = "viewModel";
                            } else {
                                ArrayList arrayList = new ArrayList();
                                Iterator it = uvL6.A02.iterator();
                                while (it.hasNext()) {
                                    AbstractC65702TsY.A1S(it.next(), arrayList);
                                }
                                if (!(uvL6.A05.A02() instanceof SelectionActionViewItem)) {
                                    AbstractC65702TsY.A1S(uvL6.A00, arrayList);
                                }
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    C63406Sjd c63406Sjd = (C63406Sjd) it2.next();
                                    Map map4 = this.A02;
                                    if (map4 != null) {
                                        C14360o3.A0C(c63406Sjd, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>");
                                        BaseCheckoutItem baseCheckoutItem = (BaseCheckoutItem) c63406Sjd.A01;
                                        if (baseCheckoutItem != null) {
                                            vg3 = baseCheckoutItem.BKB();
                                        } else {
                                            vg3 = null;
                                        }
                                        UGL ugl = (UGL) map4.get(vg3);
                                        if (ugl != null) {
                                            C3OO A06 = ugl.A06(this);
                                            LinearLayout linearLayout = this.A00;
                                            if (linearLayout == null) {
                                                str = "listContainer";
                                            } else {
                                                linearLayout.addView(A06.itemView);
                                                ugl.A07(A06, c63406Sjd);
                                            }
                                        }
                                    }
                                }
                                return;
                            }
                        }
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        C14360o3.A0F("viewModel");
        throw C00O.createAndThrow();
    }

    public UCb(Context context) {
        super(context);
        View.inflate(getContext(), R.layout.fbpay_ui_address_list_cell, this);
        this.A03 = new X59(this, 19);
    }
}

package com.instagram.debug.quickexperiment;

import X.AbstractC166987dD;
import X.C0K8;
import X.C2US;
import X.C31335Dq0;
import X.C31566Dts;
import X.C32430EQi;
import X.C32439EQr;
import X.C32440EQs;
import X.C34957Fah;
import X.C36731GHa;
import X.GHX;
import X.GHY;
import X.InterfaceC65242xM;
import X.InterfaceC65642y0;
import android.content.Context;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.List;

/* loaded from: classes6.dex */
public class QuickExperimentEditAdapter extends C2US implements InterfaceC65242xM {
    public static final Class TAG = QuickExperimentEditAdapter.class;
    public List mCategoryList;
    public final Context mContext;
    public final C31566Dts mHeaderBinderGroup;
    public final C32439EQr mMenuItemBinderGroup;
    public final C32430EQi mMenuItemWithActionLabelViewBinderGroup;
    public final C32440EQs mSwitchBinderGroup;

    public QuickExperimentEditAdapter(Context context) {
        super(false);
        this.mCategoryList = AbstractC166987dD.A1E();
        this.mContext = context;
        C32439EQr c32439EQr = new C32439EQr(context);
        this.mMenuItemBinderGroup = c32439EQr;
        C32440EQs c32440EQs = new C32440EQs(context);
        this.mSwitchBinderGroup = c32440EQs;
        C31566Dts c31566Dts = new C31566Dts(context, null);
        this.mHeaderBinderGroup = c31566Dts;
        C32430EQi c32430EQi = new C32430EQi(context);
        this.mMenuItemWithActionLabelViewBinderGroup = c32430EQi;
        init(c31566Dts, c32430EQi, c32439EQr, c32440EQs);
        updateItems();
    }

    @Override // X.InterfaceC65242xM
    public QuickExperimentEditAdapter getAdapter() {
        return this;
    }

    @Override // X.InterfaceC65242xM
    public /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    public void setMenuItemList(List list) {
        this.mCategoryList.clear();
        this.mCategoryList.addAll(list);
        updateItems();
    }

    private void updateItems() {
        InterfaceC65642y0 interfaceC65642y0;
        C34957Fah c34957Fah;
        InterfaceC65642y0 interfaceC65642y02;
        clear();
        for (Object obj : this.mCategoryList) {
            if (obj instanceof C31335Dq0) {
                interfaceC65642y0 = this.mHeaderBinderGroup;
            } else {
                if (obj instanceof GHX) {
                    c34957Fah = new C34957Fah(false, false, true);
                    interfaceC65642y02 = this.mMenuItemWithActionLabelViewBinderGroup;
                } else if (obj instanceof GHY) {
                    c34957Fah = new C34957Fah(false, false, false);
                    interfaceC65642y02 = this.mMenuItemBinderGroup;
                } else if (obj instanceof C36731GHa) {
                    interfaceC65642y0 = this.mSwitchBinderGroup;
                } else {
                    C0K8.A02(TAG, StringFormatUtil.formatStrLocaleSafe("## Missing BinderGroup support=%s", obj.toString()));
                }
                addModel(obj, c34957Fah, interfaceC65642y02);
            }
            addModel(obj, interfaceC65642y0);
        }
        updateListView();
    }
}

package com.instagram.debug.quickexperiment;

import X.AbstractC166987dD;
import X.C0K8;
import X.C168737g7;
import X.C2US;
import X.C31335Dq0;
import X.C32430EQi;
import X.C32431EQj;
import X.C32439EQr;
import X.C32440EQs;
import X.C34531FJr;
import X.C34957Fah;
import X.C35119FeM;
import X.C36731GHa;
import X.EQR;
import X.GHX;
import X.GHY;
import X.GYX;
import X.InterfaceC65242xM;
import X.InterfaceC65642y0;
import android.content.Context;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.List;

/* loaded from: classes6.dex */
public class OverlayConfigEditAdapter extends C2US implements InterfaceC65242xM {
    public static final String TAG = "OverlayConfigEditAdapter";
    public final C168737g7 mHeaderBinderGroup;
    public List mItems;
    public final C32439EQr mMenuItemBinderGroup;
    public final C32430EQi mMenuItemWithActionLabelViewBinderGroup;
    public final C32431EQj mSeparatorBinderGroup;
    public final C34531FJr mSimpleBadgeHeaderPaddingState;
    public final C32440EQs mSwitchBinderGroup;
    public final EQR mTypeaheadHeaderBinderGroup;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.FJr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, X.EQR, X.2y0] */
    public OverlayConfigEditAdapter(Context context, GYX gyx) {
        super(false);
        this.mItems = AbstractC166987dD.A1E();
        C32439EQr c32439EQr = new C32439EQr(context);
        this.mMenuItemBinderGroup = c32439EQr;
        C168737g7 c168737g7 = new C168737g7(context);
        this.mHeaderBinderGroup = c168737g7;
        C32430EQi c32430EQi = new C32430EQi(context);
        this.mMenuItemWithActionLabelViewBinderGroup = c32430EQi;
        this.mSimpleBadgeHeaderPaddingState = new Object();
        ?? obj = new Object();
        obj.A00 = gyx;
        this.mTypeaheadHeaderBinderGroup = obj;
        C32440EQs c32440EQs = new C32440EQs(context);
        this.mSwitchBinderGroup = c32440EQs;
        C32431EQj c32431EQj = new C32431EQj(context);
        this.mSeparatorBinderGroup = c32431EQj;
        init(c168737g7, c32439EQr, c32440EQs, c32430EQi, obj, c32431EQj);
        updateItems();
    }

    @Override // X.InterfaceC65242xM
    public OverlayConfigEditAdapter getAdapter() {
        return this;
    }

    @Override // X.InterfaceC65242xM
    public /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    public void setMenuItemList(List list) {
        this.mItems.clear();
        this.mItems.addAll(list);
        updateItems();
    }

    private void updateItems() {
        Object obj;
        InterfaceC65642y0 interfaceC65642y0;
        InterfaceC65642y0 interfaceC65642y02;
        clear();
        addModel(null, this.mTypeaheadHeaderBinderGroup);
        for (Object obj2 : this.mItems) {
            if (obj2 instanceof C31335Dq0) {
                obj = this.mSimpleBadgeHeaderPaddingState;
                interfaceC65642y0 = this.mHeaderBinderGroup;
            } else if (obj2 instanceof GHX) {
                obj = new C34957Fah(false, false, true);
                interfaceC65642y0 = this.mMenuItemWithActionLabelViewBinderGroup;
            } else if (obj2 instanceof GHY) {
                obj = new C34957Fah(false, false, false);
                interfaceC65642y0 = this.mMenuItemBinderGroup;
            } else {
                if (obj2 instanceof C36731GHa) {
                    interfaceC65642y02 = this.mSwitchBinderGroup;
                } else if (obj2 instanceof C35119FeM) {
                    interfaceC65642y02 = this.mSeparatorBinderGroup;
                } else {
                    C0K8.A0C(TAG, StringFormatUtil.formatStrLocaleSafe("## Missing BinderGroup support=%s", obj2.toString()));
                }
                addModel(obj2, interfaceC65642y02);
            }
            addModel(obj2, obj, interfaceC65642y0);
        }
        notifyDataSetChanged();
    }

    @Override // X.C2UT
    public void updateListView() {
        notifyDataSetChanged();
    }
}

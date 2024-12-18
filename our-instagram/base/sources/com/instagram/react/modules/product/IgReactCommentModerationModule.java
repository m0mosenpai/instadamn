package com.instagram.react.modules.product;

import X.AbstractC111324zv;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC31171DnF;
import X.AbstractC31173DnH;
import X.AbstractC31178DnM;
import X.AbstractC58319PtB;
import X.AbstractC58321PtD;
import X.AbstractC58410Puo;
import X.C0w9;
import X.C1GJ;
import X.C1ON;
import X.C25621Ms;
import X.C37484Gf2;
import X.C39026HGc;
import X.C40781ul;
import X.C55702hA;
import X.C63255SgD;
import X.InterfaceC65622ToD;
import X.MSV;
import X.MSW;
import X.R3M;
import X.RunnableC36959GQc;
import X.SF3;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.facebook.fbreact.specs.NativeIGCommentModerationReactModuleSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.instagram.model.comments.ParcelableCommenterDetails;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ReactModule(name = "IGCommentModerationReactModule")
/* loaded from: classes10.dex */
public class IgReactCommentModerationModule extends NativeIGCommentModerationReactModuleSpec {
    public static final String ERROR_SERVER_ERR = "E_SERVER_ERR";
    public static final String MODULE_NAME = "IGCommentModerationReactModule";
    public AbstractC12990ll mSession;

    @Override // com.facebook.fbreact.specs.NativeIGCommentModerationReactModuleSpec
    public void fetchBlockedCommenters(InterfaceC65622ToD interfaceC65622ToD) {
        interfaceC65622ToD.resolve(null);
    }

    @Override // com.facebook.fbreact.specs.NativeIGCommentModerationReactModuleSpec
    public void fetchCommentAudienceControlType(InterfaceC65622ToD interfaceC65622ToD) {
        interfaceC65622ToD.resolve(null);
    }

    @Override // com.facebook.fbreact.specs.NativeIGCommentModerationReactModuleSpec
    public void fetchCommentCategoryFilterDisabled(InterfaceC65622ToD interfaceC65622ToD) {
        interfaceC65622ToD.resolve(null);
    }

    @Override // com.facebook.fbreact.specs.NativeIGCommentModerationReactModuleSpec
    public void fetchCommentFilter(InterfaceC65622ToD interfaceC65622ToD) {
        interfaceC65622ToD.resolve(null);
    }

    @Override // com.facebook.fbreact.specs.NativeIGCommentModerationReactModuleSpec
    public void fetchCommentFilterKeywords(InterfaceC65622ToD interfaceC65622ToD) {
        interfaceC65622ToD.resolve(null);
    }

    @Override // com.facebook.fbreact.specs.NativeIGCommentModerationReactModuleSpec
    public void fetchCurrentUser(InterfaceC65622ToD interfaceC65622ToD) {
        interfaceC65622ToD.resolve(null);
    }

    @Override // com.facebook.fbreact.specs.NativeIGCommentModerationReactModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "IGCommentModerationReactModule";
    }

    public static ParcelableCommenterDetails getParcelableCommenterDetails(HashMap hashMap) {
        return new ParcelableCommenterDetails(AbstractC58319PtB.A0v(AbstractC58410Puo.A01(43, 8, 117), hashMap), AbstractC58319PtB.A0v("full_name", hashMap), AbstractC58319PtB.A0v("profile_pic_url", hashMap), AbstractC58319PtB.A0v("profile_pic_id", hashMap), MSW.A00(hashMap.get("pk")), AbstractC166987dD.A1a(hashMap.get("is_verified")), AbstractC166987dD.A1a(hashMap.get("is_private")));
    }

    private void scheduleTask(C1ON c1on, InterfaceC65622ToD interfaceC65622ToD) {
        c1on.A00 = new C37484Gf2(11, this, interfaceC65622ToD);
        C1GJ.A03(c1on);
    }

    @Override // com.facebook.fbreact.specs.NativeIGCommentModerationReactModuleSpec
    public void setCommentAudienceControlType(String str, InterfaceC65622ToD interfaceC65622ToD) {
        C25621Ms A0M = AbstractC31173DnH.A0M(this.mSession);
        A0M.A0B("accounts/set_comment_audience_control_type/");
        A0M.A9s("audience_control", str);
        C1ON A0I = AbstractC31178DnM.A0I(A0M, C40781ul.class, C55702hA.class);
        A0I.A00 = new C39026HGc(interfaceC65622ToD, this, str, 0);
        C1GJ.A03(A0I);
    }

    @Override // com.facebook.fbreact.specs.NativeIGCommentModerationReactModuleSpec
    public void setCommentCategoryFilterDisabled(boolean z, InterfaceC65622ToD interfaceC65622ToD) {
        String str;
        C25621Ms A0M = AbstractC31173DnH.A0M(this.mSession);
        A0M.A0B("accounts/set_comment_category_filter_disabled/");
        if (z) {
            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str = "0";
        }
        A0M.A9s("disabled", str);
        scheduleTask(AbstractC31178DnM.A0I(A0M, C40781ul.class, C55702hA.class), interfaceC65622ToD);
    }

    @Override // com.facebook.fbreact.specs.NativeIGCommentModerationReactModuleSpec
    public void setCustomKeywords(String str, InterfaceC65622ToD interfaceC65622ToD) {
        C25621Ms A0M = AbstractC31173DnH.A0M(this.mSession);
        A0M.A0B("accounts/set_comment_filter_keywords/");
        A0M.A9s("keywords", str);
        scheduleTask(AbstractC31178DnM.A0I(A0M, C40781ul.class, C55702hA.class), interfaceC65622ToD);
    }

    @Override // com.facebook.fbreact.specs.NativeIGCommentModerationReactModuleSpec
    public void setCustomKeywordsWithDisabled(String str, boolean z, InterfaceC65622ToD interfaceC65622ToD) {
        C25621Ms A0M = AbstractC31173DnH.A0M(this.mSession);
        A0M.A0B("accounts/set_comment_filter_keywords/");
        A0M.A9s("keywords", str);
        A0M.A0I("disabled", z);
        scheduleTask(AbstractC31178DnM.A0I(A0M, C40781ul.class, C55702hA.class), interfaceC65622ToD);
    }

    @Override // com.facebook.fbreact.specs.NativeIGCommentModerationReactModuleSpec
    public void setUseDefaultKeywords(boolean z, InterfaceC65622ToD interfaceC65622ToD) {
        String str;
        C25621Ms A0M = AbstractC31173DnH.A0M(this.mSession);
        A0M.A0B("accounts/set_comment_filter/");
        if (z) {
            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str = "0";
        }
        A0M.A9s("config_value", str);
        scheduleTask(AbstractC31178DnM.A0I(A0M, C40781ul.class, C55702hA.class), interfaceC65622ToD);
    }

    public IgReactCommentModerationModule(R3M r3m, AbstractC12990ll abstractC12990ll) {
        super(r3m);
        this.mSession = abstractC12990ll;
    }

    @Override // com.facebook.fbreact.specs.NativeIGCommentModerationReactModuleSpec
    public void openCommenterBlockingViewControllerWithReactTag(double d, ReadableArray readableArray, Callback callback) {
        Activity A01 = AbstractC58321PtD.A0b(this).A01();
        A01.getClass();
        FragmentActivity fragmentActivity = (FragmentActivity) A01;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = readableArray.toArrayList().iterator();
        while (it.hasNext()) {
            A1E.add(getParcelableCommenterDetails((HashMap) it.next()));
        }
        C63255SgD.A01(new RunnableC36959GQc(fragmentActivity, new SF3(callback, this), this, A1E));
    }

    @Override // com.facebook.fbreact.specs.NativeIGCommentModerationReactModuleSpec
    public void setBlockedCommenters(ReadableMap readableMap, InterfaceC65622ToD interfaceC65622ToD) {
        try {
            JSONObject A0q = AbstractC31171DnF.A0q();
            if (readableMap.hasKey("block")) {
                A0q.put("block", new JSONArray((Collection) readableMap.getArray("block").toArrayList()));
            }
            if (readableMap.hasKey("unblock")) {
                A0q.put("unblock", new JSONArray((Collection) readableMap.getArray("unblock").toArrayList()));
            }
            C25621Ms A0M = AbstractC31173DnH.A0M(this.mSession);
            A0M.A0B(MSV.A00(893));
            A0M.AA6(MSV.A00(1076), A0q.toString());
            A0M.A0S(C40781ul.class, C55702hA.class);
            A0M.A9s(AbstractC111324zv.A00(4173), "block_commenters");
            A0M.A0R = true;
            scheduleTask(A0M.A0N(), interfaceC65622ToD);
        } catch (JSONException e) {
            C0w9.A06("IgReactCommentModerationModule", "Failed to send block commenter request", e);
        }
    }
}

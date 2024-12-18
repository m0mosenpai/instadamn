package com.instagram.share.handleractivity;

import X.AbstractC003100w;
import X.AbstractC111324zv;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31177DnL;
import X.AbstractC31178DnM;
import X.AbstractC35190Ffi;
import X.AbstractC54201Nxf;
import X.AbstractC70197WGf;
import X.AbstractC93174Ft;
import X.C006802i;
import X.C00O;
import X.C05F;
import X.C06090Tz;
import X.C0f9;
import X.C0w9;
import X.C12260kU;
import X.C14360o3;
import X.C14H;
import X.C18U;
import X.C1GJ;
import X.C1ON;
import X.C25621Ms;
import X.C45123Jxs;
import X.C50472Tr;
import X.C54910OQh;
import X.C56066Ouj;
import X.G0H;
import X.InterfaceC11380iw;
import X.MSW;
import X.N3C;
import X.NAC;
import X.RunnableC57085PTy;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.base.activity.IgFragmentActivity;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes9.dex */
public final class CustomStoryShareHandlerActivity extends IgFragmentActivity implements InterfaceC11380iw {
    public AbstractC18680vv A00;
    public C006802i A01;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "share_handler";
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        C14360o3.A0B(intent, 0);
        super.onNewIntent(intent);
        setIntent(intent);
        A00();
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, X.OZb] */
    private final void A00() {
        String str;
        int i;
        int i2;
        String str2;
        String str3;
        Intent intent = getIntent();
        Intent intent2 = getIntent();
        C14360o3.A07(intent2);
        AbstractC18680vv abstractC18680vv = this.A00;
        if (abstractC18680vv != null) {
            C45123Jxs A00 = AbstractC54201Nxf.A00(this, intent2, abstractC18680vv);
            AbstractC18680vv abstractC18680vv2 = this.A00;
            C06090Tz c06090Tz = C06090Tz.A05;
            HashMap hashMap = null;
            if (AbstractC31178DnM.A1X(c06090Tz, abstractC18680vv2, 36321370191177076L)) {
                str = intent.getStringExtra("caption_text");
            } else {
                str = null;
            }
            C006802i c006802i = this.A01;
            if (c006802i != null) {
                if (!c006802i.isMarkerOn(18951415)) {
                    C006802i c006802i2 = this.A01;
                    if (c006802i2 != null) {
                        c006802i2.markerStart(18951415);
                        C006802i c006802i3 = this.A01;
                        if (c006802i3 != null) {
                            c006802i3.markerAnnotate(18951415, "share_handler_type", "internal");
                        }
                    }
                }
                if (AbstractC31178DnM.A1X(c06090Tz, this.A00, 36315649294732755L)) {
                    String str4 = A00.A05;
                    if (str4.length() <= 0) {
                        List A0m = AbstractC167007dF.A0m(C18U.A04(C06090Tz.A06, this.A00, 36878599248216258L), InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0);
                        if (AbstractC31178DnM.A1X(c06090Tz, this.A00, 2342158658508557780L)) {
                            str4 = A00.A04;
                        }
                        if (!A0m.contains(str4) && AbstractC31178DnM.A1X(c06090Tz, this.A00, 36315649294929365L) && AbstractC003100w.A0i(str4) == null) {
                            StringBuilder A1C = AbstractC166987dD.A1C();
                            A1C.append("Missing attribution namespace from source app. Extracted source app: ");
                            A1C.append(A00);
                            C0w9.A03("CustomStoryShareHandlerActivity", AbstractC166997dE.A0x(".sourceNamespace", A1C));
                            Intent intent3 = new Intent("android.intent.action.BUG_REPORT");
                            intent3.putExtra("android.intent.extra.BUG_REPORT", "Missing Facebook App ID. For more information, see https://developers.facebook.com/blog/post/2022/10/10/introducing-important-update-to-Instagram-sharing-to-stories/");
                            setResult(0, intent3);
                            Intent A01 = C14H.A03.A00().A01(this);
                            A01.putExtra("StoryHandlerActivity.EXTRA_SHARE_INTENT", intent);
                            A01.putExtra("StoryHandlerActivity.EXTRA_MISSING_FB_APP_ID", true);
                            C12260kU.A00.A07().A0G(this, A01);
                            str2 = "no_attribution_namespace";
                            A01(this, str2);
                            finish();
                            return;
                        }
                    }
                }
                AbstractC18680vv abstractC18680vv3 = this.A00;
                if (abstractC18680vv3 != null) {
                    String str5 = A00.A04;
                    C14360o3.A0B(str5, 0);
                    if ("com.facebook.fundraiser.share".equals(str5)) {
                        ?? obj = new Object();
                        C14360o3.A0A(intent);
                        AbstractC167007dF.A1K(intent, abstractC18680vv3);
                        AbstractC70197WGf.A06(this, new G0H(3, this, intent, abstractC18680vv3, obj), C50472Tr.A02(this, false), 0.2f, -11033345, -1965836, false);
                        if (C18U.A06(c06090Tz, abstractC18680vv3, 36315486085975304L)) {
                            String A002 = AbstractC111324zv.A00(114);
                            String stringExtra = intent.getStringExtra(A002);
                            if (stringExtra == null) {
                                return;
                            }
                            C25621Ms A0M = AbstractC31177DnL.A0M(abstractC18680vv3);
                            A0M.A0L("fundraiser/%s/viewer_info_for_linked_fundraiser_sticker/", stringExtra);
                            A0M.A9s(A002, stringExtra);
                            C1ON A0R = AbstractC31172DnG.A0R(null, A0M, N3C.class, C54910OQh.class, false);
                            A0R.A00 = new NAC(2, this, intent, abstractC18680vv3, obj);
                            C1GJ.A03(A0R);
                            return;
                        }
                        obj.A01 = false;
                        return;
                    }
                    Uri data = intent.getData();
                    Uri uri = (Uri) intent.getParcelableExtra("interactive_asset_uri");
                    String stringExtra2 = intent.getStringExtra("top_background_color");
                    String stringExtra3 = intent.getStringExtra("bottom_background_color");
                    try {
                        i = Color.parseColor(stringExtra2);
                    } catch (Exception unused) {
                        i = -16777216;
                    }
                    try {
                        i2 = Color.parseColor(stringExtra3);
                    } catch (Exception unused2) {
                        i2 = -16777216;
                    }
                    if (C14360o3.A0K(getCallingPackage(), AbstractC35190Ffi.A00(getPackageManager()))) {
                        Integer[] A003 = C05F.A00(3);
                        int length = A003.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 < length) {
                                switch (MSW.A07(A003, i3)) {
                                    case 1:
                                        str3 = "com.facebook.events";
                                        break;
                                    case 2:
                                        str3 = "com.facebook.feed";
                                        break;
                                    default:
                                        str3 = "com.facebook.groups";
                                        break;
                                }
                                if (str3.equals(str5)) {
                                    hashMap = AbstractC166987dD.A1G();
                                    hashMap.put("fb_community_type", intent.getStringExtra("fb_community_type"));
                                    hashMap.put("fb_community_id", intent.getStringExtra("fb_community_id"));
                                    hashMap.put("fb_community_subtype", intent.getStringExtra("fb_community_subtype"));
                                    hashMap.put("fb_community_author_id", intent.getStringExtra("fb_community_author_id"));
                                    hashMap.put("fb_community_url", intent.getStringExtra("fb_community_url"));
                                    hashMap.put("fb_community_mib_extid", intent.getStringExtra("fb_community_mib_extid"));
                                    hashMap.put("fb_community_reshare_session_id", intent.getStringExtra("fb_community_reshare_session_id"));
                                } else {
                                    i3++;
                                }
                            }
                        }
                    }
                    if ((data != null && data != Uri.EMPTY) || (uri != null && uri != Uri.EMPTY)) {
                        RunnableC57085PTy runnableC57085PTy = new RunnableC57085PTy(intent, data, uri, A00, abstractC18680vv3, this, str, hashMap, i, i2);
                        if (AbstractC93174Ft.A03(this)) {
                            runnableC57085PTy.run();
                            return;
                        } else {
                            AbstractC93174Ft.A01(this, new C56066Ouj(1, runnableC57085PTy, this));
                            return;
                        }
                    }
                    str2 = "invalid_asset_uri";
                    A01(this, str2);
                    finish();
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            C14360o3.A0F("quickPerformanceLogger");
            throw C00O.createAndThrow();
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public static final void A01(CustomStoryShareHandlerActivity customStoryShareHandlerActivity, String str) {
        C006802i c006802i = customStoryShareHandlerActivity.A01;
        if (c006802i != null) {
            if (c006802i.isMarkerOn(18951415)) {
                C006802i c006802i2 = customStoryShareHandlerActivity.A01;
                if (c006802i2 != null) {
                    c006802i2.markerAnnotate(18951415, TraceFieldType.FailureReason, str);
                    C006802i c006802i3 = customStoryShareHandlerActivity.A01;
                    if (c006802i3 != null) {
                        c006802i3.markerEnd(18951415, (short) 3);
                        return;
                    }
                }
            } else {
                return;
            }
        }
        C14360o3.A0F("quickPerformanceLogger");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(850251905);
        super.onCreate(bundle);
        this.A00 = AbstractC31171DnF.A0F(this);
        this.A01 = C006802i.A0p;
        A00();
        C0f9.A07(-1310808178, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}

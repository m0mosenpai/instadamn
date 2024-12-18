package com.instagram.share.handleractivity;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31178DnM;
import X.AbstractC54201Nxf;
import X.AbstractC54202Nxg;
import X.C006802i;
import X.C00O;
import X.C06090Tz;
import X.C0f9;
import X.C14360o3;
import X.C45123Jxs;
import X.InterfaceC11380iw;
import X.POO;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.IgActivity;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public class StoryShareHandlerActivity extends IgActivity implements InterfaceC11380iw {
    public AbstractC12990ll A00;
    public C006802i A01;

    private final void A00() {
        List parcelableArrayListExtra;
        String str;
        Intent intent = getIntent();
        if (!"android.intent.action.SEND_MULTIPLE".equals(intent.getAction()) && !C14360o3.A0K(intent.getAction(), "com.instagram.share.ADD_TO_STORY_MULTIPLE")) {
            parcelableArrayListExtra = AbstractC166987dD.A1J(intent.getParcelableExtra("android.intent.extra.STREAM"));
        } else {
            parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        if (parcelableArrayListExtra != null) {
            for (Object obj : parcelableArrayListExtra) {
                if (obj != null) {
                    A1E.add(obj);
                }
            }
        }
        Intent intent2 = getIntent();
        C14360o3.A07(intent2);
        AbstractC12990ll abstractC12990ll = this.A00;
        if (abstractC12990ll != null) {
            C45123Jxs A00 = AbstractC54201Nxf.A00(this, intent2, abstractC12990ll);
            C006802i c006802i = this.A01;
            str = "quickPerformanceLogger";
            String str2 = null;
            if (c006802i != null) {
                if (!c006802i.isMarkerOn(18951415)) {
                    C006802i c006802i2 = this.A01;
                    if (c006802i2 != null) {
                        c006802i2.markerStart(18951415);
                        C006802i c006802i3 = this.A01;
                        if (c006802i3 != null) {
                            c006802i3.markerAnnotate(18951415, "share_handler_type", "OS");
                        }
                    }
                }
                AbstractC12990ll abstractC12990ll2 = this.A00;
                if (abstractC12990ll2 != null) {
                    if (AbstractC31178DnM.A1X(C06090Tz.A05, abstractC12990ll2, 36321370191177076L)) {
                        str2 = intent.getStringExtra("caption_text");
                    }
                    AbstractC12990ll abstractC12990ll3 = this.A00;
                    if (abstractC12990ll3 != null) {
                        AbstractC54202Nxg.A00(this, intent, null, A00, abstractC12990ll3, new POO(this), str2, null, A1E, -16777216, -16777216);
                        return;
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        str = "session";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "share_handler";
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        C14360o3.A0B(intent, 0);
        setIntent(intent);
        A00();
    }

    @Override // com.instagram.base.activity.IgActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(2094589868);
        super.onCreate(bundle);
        AbstractC18680vv A0F = AbstractC31171DnF.A0F(this);
        C14360o3.A0B(A0F, 0);
        this.A00 = A0F;
        this.A01 = C006802i.A0p;
        A00();
        C0f9.A07(-172127595, A00);
    }
}

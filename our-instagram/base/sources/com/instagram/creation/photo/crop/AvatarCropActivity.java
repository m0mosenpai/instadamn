package com.instagram.creation.photo.crop;

import X.AbstractC10360h2;
import X.AbstractC12990ll;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC31173DnH;
import X.AbstractC31180DnO;
import X.AbstractC69933Cc;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C14240no;
import X.C14360o3;
import X.C1H6;
import X.C45490KCf;
import X.InterfaceC50451MPf;
import X.MSY;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CropInfo;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class AvatarCropActivity extends IgFragmentActivity implements InterfaceC50451MPf {
    public UserSession A00;

    @Override // X.InterfaceC50451MPf
    public final void D1r() {
        setResult(0);
        finish();
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    @Override // X.InterfaceC50451MPf
    public final void DH7(Location location, Uri uri, MediaUploadMetadata mediaUploadMetadata, CropInfo cropInfo, String str, String str2, String str3, HashMap hashMap, int i, int i2) {
        AbstractC31180DnO.A0y(this, new Intent(uri.toString()));
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(975380221);
        requestWindowFeature(1);
        super.onCreate(bundle);
        C1H6.A01(this);
        C09Y c09y = C023409i.A0A;
        Bundle A0A = AbstractC31173DnH.A0A(this);
        if (A0A != null) {
            this.A00 = c09y.A06(A0A);
            setContentView(R.layout.activity_single_container);
            AbstractC10360h2 supportFragmentManager = getSupportFragmentManager();
            C14360o3.A07(supportFragmentManager);
            if (supportFragmentManager.A0O(R.id.layout_container_main) == null) {
                C14240no A0G = MSY.A0G(this);
                AbstractC69933Cc.A01();
                C45490KCf c45490KCf = new C45490KCf();
                c45490KCf.setArguments(AbstractC31173DnH.A0A(this));
                A0G.A0A(c45490KCf, R.id.layout_container_main);
                A0G.A00();
            }
            C0f9.A07(-376666201, A00);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A07(1347945438, A00);
        throw A0g;
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return this.A00;
    }
}

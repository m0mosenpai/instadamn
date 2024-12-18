package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import java.io.File;

/* renamed from: X.AeG, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23681AeG implements XCU {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C23681AeG(Activity activity, Bundle bundle, UserSession userSession, int i) {
        this.A00 = i;
        this.A02 = bundle;
        switch (i) {
            case 0:
            case 2:
                this.A03 = userSession;
                this.A01 = activity;
                break;
            case 1:
            default:
                this.A01 = activity;
                this.A03 = userSession;
                break;
        }
    }

    @Override // X.XCU
    public final void onFailure(Exception exc) {
        switch (this.A00) {
            case 0:
                C0w9.A03("ReelProfileShareHelper", "Could not create background media for shareProfileToStory().");
                return;
            case 1:
            default:
                return;
            case 2:
                C9GR.A0C((Context) this.A01, MSV.A00(88));
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.XCU
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Bundle bundle;
        AbstractC12990ll abstractC12990ll;
        Activity activity;
        Class<TransparentModalActivity> cls;
        int i;
        String A00;
        switch (this.A00) {
            case 0:
                File A0Z = AbstractC166997dE.A0Z(obj);
                bundle = (Bundle) this.A02;
                bundle.putString("ReelProfileStickerConstants.ARGUMENTS_KEY_FILE_PATH", A0Z.getAbsolutePath());
                abstractC12990ll = (AbstractC12990ll) this.A03;
                activity = (Activity) this.A01;
                cls = TransparentModalActivity.class;
                i = 2988;
                A00 = AbstractC111324zv.A00(i);
                C6XJ.A02(activity, bundle, abstractC12990ll, cls, A00).A0C(activity);
                return;
            case 1:
                File A0Z2 = AbstractC166997dE.A0Z(obj);
                bundle = (Bundle) this.A02;
                bundle.putString("before_and_after_key_file_path", A0Z2.getCanonicalPath());
                activity = (Activity) this.A01;
                abstractC12990ll = (AbstractC12990ll) this.A03;
                cls = TransparentModalActivity.class;
                i = 2962;
                A00 = AbstractC111324zv.A00(i);
                C6XJ.A02(activity, bundle, abstractC12990ll, cls, A00).A0C(activity);
                return;
            case 2:
                File A0Z3 = AbstractC166997dE.A0Z(obj);
                bundle = (Bundle) this.A02;
                bundle.putString("ClipsConstants.ARG_CLIPS_SHARE_BACKGROUND_FILE_PATH", A0Z3.getCanonicalPath());
                abstractC12990ll = (AbstractC12990ll) this.A03;
                cls = TransparentModalActivity.class;
                activity = (Activity) this.A01;
                A00 = "reel_clips_share";
                C6XJ.A02(activity, bundle, abstractC12990ll, cls, A00).A0C(activity);
                return;
            default:
                return;
        }
    }
}

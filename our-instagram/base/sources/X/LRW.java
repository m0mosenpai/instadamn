package X;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.assetpicker.cutout.data.CutoutStickerRepository;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public final class LRW implements C06Z {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ AbstractC10360h2 A02;
    public final /* synthetic */ InterfaceC11380iw A03;
    public final /* synthetic */ UserSession A04;

    public LRW(Context context, FragmentActivity fragmentActivity, AbstractC10360h2 abstractC10360h2, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A01 = fragmentActivity;
        this.A04 = userSession;
        this.A03 = interfaceC11380iw;
        this.A00 = context;
        this.A02 = abstractC10360h2;
    }

    @Override // X.C06Z
    public final void DIA(String str, Bundle bundle) {
        C14360o3.A0B(bundle, 1);
        boolean z = bundle.getBoolean("result_sticker_creation_status");
        FragmentActivity fragmentActivity = this.A01;
        Application application = fragmentActivity.getApplication();
        C14360o3.A07(application);
        UserSession userSession = this.A04;
        C8OP c8op = (C8OP) new C52942bb(new C8OO(application, userSession), fragmentActivity).A00(C8OP.class);
        if (z) {
            C47614L0z c47614L0z = new C47614L0z(fragmentActivity, userSession);
            InterfaceC11380iw interfaceC11380iw = this.A03;
            Bitmap bitmap = ((CutoutStickerRepository) c8op.A0F.getValue()).A00;
            WeakReference A16 = AbstractC25225BEi.A16(this.A00);
            AbstractC167017dG.A1O(interfaceC11380iw, A16);
            if ((!c47614L0z.A02.A1p()) && bitmap != null) {
                AbstractC167007dF.A0J().postDelayed(new M56(bitmap, interfaceC11380iw, c47614L0z), 500L);
            } else {
                Context context = (Context) A16.get();
                if (context != null) {
                    LKV.A03(context, AbstractC166997dE.A0p(context, 2131957436), null, ((NineSixteenLayoutConfigImpl) AbstractC58002lE.A00(context, c47614L0z.A01)).A0G);
                }
            }
        }
        this.A02.A0w("cutout_sticker_creation_fragment_request_key");
    }
}

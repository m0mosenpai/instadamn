package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.4Fa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C93014Fa {
    public final C85793s8 A00;
    public final C85993sW A01;

    public C93014Fa(Context context, FragmentActivity fragmentActivity, UserSession userSession, C4FX c4fx, InterfaceC60442pS interfaceC60442pS, InterfaceC60682pr interfaceC60682pr, C1M1 c1m1, String str, boolean z) {
        C85993sW c85993sW = new C85993sW(context, fragmentActivity, interfaceC60442pS, userSession, c4fx.BS4(), interfaceC60682pr, z, true);
        C85793s8 c85793s8 = new C85793s8(context, fragmentActivity, userSession, c4fx.BQw(), c1m1, str, false, z);
        this.A01 = c85993sW;
        this.A00 = c85793s8;
    }
}

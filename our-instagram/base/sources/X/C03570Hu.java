package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import com.instagram.process.instagram.InstagramApplicationForMainProcess;

/* renamed from: X.0Hu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03570Hu extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ InstagramApplicationForMainProcess A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03570Hu(InstagramApplicationForMainProcess instagramApplicationForMainProcess) {
        super(0);
        this.A00 = instagramApplicationForMainProcess;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final Context context = this.A00.appContext;
        return new AbstractC211911v(context) { // from class: X.14D
            public final Context A00;

            {
                C14360o3.A0B(context, 1);
                this.A00 = context;
            }

            @Override // X.AbstractC211911v
            public final String A06() {
                return "MapConfigInitializer";
            }

            @Override // X.AbstractC211911v
            public final void A07() {
                C2TC c2tc = new C2TC(C20150ym.A03(AbstractC20100yh.A00(36875034425425983L)), C20150ym.A03(AbstractC20100yh.A00(36875034425491520L)), new Rect[0], new String[0], new C2TB[0], Integer.MAX_VALUE);
                Context context2 = this.A00;
                C2TD.A0C = AnonymousClass001.A0T("567067343352427", "f249176f09e26ce54212b472dbab8fa8", '|');
                C2TD.A02 = context2.getApplicationContext();
                C2TD.A00 = 0L;
                C2TD.A06 = true;
                C2TD.A0B = c2tc;
                if (C2TD.A01 == null) {
                    BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: X.2TE
                        @Override // android.content.BroadcastReceiver
                        public final void onReceive(Context context3, Intent intent) {
                            int A01 = C0f9.A01(-1067704972);
                            C0fM.A01(this, context3, intent);
                            if ("android.intent.action.LOCALE_CHANGED".equals(intent.getAction())) {
                                C2TD.A00();
                            }
                            C0f9.A0E(1146566867, A01, intent);
                        }
                    };
                    C2TD.A01 = broadcastReceiver;
                    C0DJ.A00(broadcastReceiver, C2TD.A02, new IntentFilter("android.intent.action.LOCALE_CHANGED"));
                }
            }
        };
    }
}

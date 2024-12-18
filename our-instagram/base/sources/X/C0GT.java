package X;

import android.content.Context;
import android.os.AsyncTask;
import com.instagram.process.instagram.InstagramApplicationForMainProcess;

/* renamed from: X.0GT, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0GT extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ InstagramApplicationForMainProcess A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0GT(InstagramApplicationForMainProcess instagramApplicationForMainProcess) {
        super(0);
        this.A00 = instagramApplicationForMainProcess;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final Context context = this.A00.appContext;
        return new AbstractC211911v(context) { // from class: X.14T
            public final Context A00;

            {
                C14360o3.A0B(context, 1);
                this.A00 = context;
            }

            @Override // X.AbstractC211911v
            public final String A06() {
                return "MultiProcessTrackerInitializer";
            }

            @Override // X.AbstractC211911v
            public final void A07() {
                AsyncTask.execute(new RunnableC03840Iz(this.A00, C0J1.A00));
            }
        };
    }
}

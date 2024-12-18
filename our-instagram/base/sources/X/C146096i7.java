package X;

import android.content.Context;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.6i7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146096i7 {
    public final Context A00;
    public final C146106i8 A01;
    public final C3O0 A02;

    public C146096i7(Context context, C2d5 c2d5) {
        C3O0 c3o0;
        C14360o3.A0B(context, 1);
        this.A00 = context;
        if (c2d5 != null) {
            c3o0 = c2d5.By1();
        } else {
            c3o0 = null;
        }
        this.A02 = c3o0;
        C146106i8 c146106i8 = new C146106i8();
        c146106i8.A0O = true;
        this.A01 = c146106i8;
    }

    public final IN8 A00(C38321qM c38321qM, Hj4 hj4, UpcomingEvent upcomingEvent, Integer num) {
        C14360o3.A0B(upcomingEvent, 0);
        return new IN8(this.A00, c38321qM, this.A01, this.A02, hj4, upcomingEvent, num);
    }
}

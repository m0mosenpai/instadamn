package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import java.io.IOException;

/* renamed from: X.JeK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44095JeK extends AbstractC62432si {
    public static final Bitmap.CompressFormat A01 = Bitmap.CompressFormat.JPEG;
    public final CallableC209819Pr A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44095JeK(Context context, android.net.Uri uri, android.net.Uri uri2, UserSession userSession) {
        super(context);
        AbstractC167027dH.A13(userSession, context, uri);
        if (this.A07) {
            A09();
        } else {
            this.A04 = true;
        }
        this.A00 = new CallableC209819Pr(context, uri, uri2, userSession, false);
    }

    @Override // X.AbstractC62442sj
    public final /* bridge */ /* synthetic */ Object A06() {
        try {
            return this.A00.call();
        } catch (IOException unused) {
            return new C44262Jh8(null, null, null);
        } catch (Exception e) {
            AbstractC12120kG.A0C("LoadImageTask_UnknownError", "Caught unknown error", e);
            return new C44262Jh8(null, null, null);
        }
    }
}

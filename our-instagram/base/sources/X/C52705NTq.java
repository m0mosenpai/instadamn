package X;

import android.content.Context;
import com.facebook.rsys.photobooth.gen.PhotoboothModel;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.NTq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52705NTq extends AbstractC54988OTw {
    public PhotoboothModel A00;
    public Integer A01;
    public Map A02;
    public final int A03;
    public final Context A04;
    public final C56126Ovm A05;
    public final UserSession A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52705NTq(Context context, UserSession userSession, C56126Ovm c56126Ovm, C54446O4a c54446O4a) {
        super(c54446O4a);
        C14360o3.A0B(c56126Ovm, 4);
        this.A04 = context;
        this.A06 = userSession;
        this.A05 = c56126Ovm;
        this.A03 = 5000;
        this.A01 = C05F.A0C;
        this.A02 = AbstractC06930Yk.A0E();
    }
}

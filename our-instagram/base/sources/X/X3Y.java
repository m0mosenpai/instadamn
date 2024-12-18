package X;

import com.facebook.flipper.plugins.bloksdebugger.Event;
import com.facebook.flipper.plugins.bloksdebugger.StateUpdateV2;
import com.facebook.flipper.plugins.bloksdebugger.StreamRateLimited;
import java.lang.annotation.Annotation;

/* loaded from: classes11.dex */
public final class X3Y extends C0YY implements InterfaceC16820sZ {
    public static final X3Y A00 = new X3Y();

    public X3Y() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C0YZ c0yz = new C0YZ(Event.class);
        InterfaceC16510rw[] interfaceC16510rwArr = {new C0YZ(C66550UMh.class), new C0YZ(C66549UMf.class), new C0YZ(C66551UMi.class), new C0YZ(StateUpdateV2.class), new C0YZ(StreamRateLimited.class)};
        C71709Wza c71709Wza = C71709Wza.A00;
        C71714Wzf c71714Wzf = C71714Wzf.A00;
        C71717Wzi c71717Wzi = C71717Wzi.A00;
        C71719Wzk c71719Wzk = C71719Wzk.A00;
        StreamRateLimited streamRateLimited = StreamRateLimited.A00;
        C14360o3.A0B(streamRateLimited, 2);
        C192628g4 c192628g4 = new C192628g4("com.facebook.flipper.plugins.bloksdebugger.StreamRateLimited", streamRateLimited);
        c192628g4.A00 = AbstractC06960Yn.A0S(new Annotation[0]);
        return new X6P("com.facebook.flipper.plugins.bloksdebugger.Event", c0yz, new Annotation[0], interfaceC16510rwArr, new C3R9[]{c71709Wza, c71714Wzf, c71717Wzi, c71719Wzk, c192628g4});
    }
}

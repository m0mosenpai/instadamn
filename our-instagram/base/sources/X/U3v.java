package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes11.dex */
public final class U3v implements InterfaceC72763Nx {
    public final /* synthetic */ C66201U3x A00;
    public final /* synthetic */ InterfaceC72763Nx A01;
    public final /* synthetic */ InterfaceC72008XEw A02;

    public U3v(C66201U3x c66201U3x, InterfaceC72763Nx interfaceC72763Nx, InterfaceC72008XEw interfaceC72008XEw) {
        this.A00 = c66201U3x;
        this.A01 = interfaceC72763Nx;
        this.A02 = interfaceC72008XEw;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x00fb. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x003b. Please report as an issue. */
    @Override // X.InterfaceC72763Nx
    public final void DfM(int i) {
        InterfaceC72008XEw interfaceC72008XEw;
        String A02;
        InterfaceC72008XEw interfaceC72008XEw2;
        InterfaceC72008XEw interfaceC72008XEw3;
        InterfaceC72008XEw interfaceC72008XEw4;
        String A022;
        String str = "Bloks Request Error.";
        try {
            this.A01.DfM(i);
            C66201U3x c66201U3x = this.A00;
            Object obj = c66201U3x.A09.get();
            if (obj != null) {
                C193028gi c193028gi = (C193028gi) obj;
                int i2 = c193028gi.A00;
                C193018gh c193018gh = c193028gi.A01;
                switch (i) {
                    case 1:
                        interfaceC72008XEw4 = this.A02;
                        A022 = C66201U3x.A02("initial_render_start", i2);
                        interfaceC72008XEw4.Cna(A022);
                        return;
                    case 2:
                        interfaceC72008XEw4 = this.A02;
                        A022 = C66201U3x.A02("initial_render_end", i2);
                        interfaceC72008XEw4.Cna(A022);
                        return;
                    case 3:
                        InterfaceC72008XEw interfaceC72008XEw5 = this.A02;
                        interfaceC72008XEw5.Cna(C66201U3x.A02("initial_render_data_end", i2));
                        if (c66201U3x.A01 == null) {
                            interfaceC72008XEw5.AF2(c193018gh.A02, "bloks_query", true, c66201U3x.A06.now());
                        }
                        C66273U6s c66273U6s = c66201U3x.A05;
                        if (c66273U6s.A09 != null && !c66273U6s.A0I) {
                            return;
                        }
                        interfaceC72008XEw5.EoN("initial_content_step");
                        return;
                    case 4:
                        if (!c193018gh.A05) {
                            return;
                        }
                        long j = c193018gh.A04;
                        if (j <= 0) {
                            return;
                        }
                        interfaceC72008XEw4 = this.A02;
                        interfaceC72008XEw4.Cnb(C66201U3x.A02("request_start", i2), j);
                        A022 = C66201U3x.A02("request_end", i2);
                        interfaceC72008XEw4.Cna(A022);
                        return;
                    case 5:
                        Throwable A05 = c66201U3x.A05();
                        if (A05 != null) {
                            str = A05.getMessage();
                        }
                        this.A02.AUk(str);
                        return;
                    case 6:
                        interfaceC72008XEw4 = this.A02;
                        A022 = C66201U3x.A02("render_start", i2);
                        interfaceC72008XEw4.Cna(A022);
                        return;
                    case 7:
                        interfaceC72008XEw3 = this.A02;
                        interfaceC72008XEw3.Cna(C66201U3x.A02("render_end", i2));
                        if (!(c66201U3x.A0A.get() instanceof C215549gU)) {
                            return;
                        }
                        interfaceC72008XEw3.EoN("action_load_step");
                        C66201U3x.A03(c66201U3x, interfaceC72008XEw3, c193028gi);
                        return;
                    case 8:
                    case 10:
                    default:
                        return;
                    case 9:
                        interfaceC72008XEw3 = this.A02;
                        interfaceC72008XEw3.Cna(C66201U3x.A02("render_data_end", i2));
                        C66201U3x.A03(c66201U3x, interfaceC72008XEw3, c193028gi);
                        return;
                    case 11:
                        interfaceC72008XEw4 = this.A02;
                        A022 = C66201U3x.A02("render_load_action_start", i2);
                        interfaceC72008XEw4.Cna(A022);
                        return;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        interfaceC72008XEw4 = this.A02;
                        A022 = C66201U3x.A02("stream_on_load_actions_start", i2);
                        interfaceC72008XEw4.Cna(A022);
                        return;
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        interfaceC72008XEw4 = this.A02;
                        A022 = C66201U3x.A02("stream_on_load_actions_end", i2);
                        interfaceC72008XEw4.Cna(A022);
                        return;
                }
            }
            throw new IllegalArgumentException("Fetch summary is missing.");
        } catch (Throwable th) {
            C66201U3x c66201U3x2 = this.A00;
            Object obj2 = c66201U3x2.A09.get();
            if (obj2 != null) {
                C193028gi c193028gi2 = (C193028gi) obj2;
                int i3 = c193028gi2.A00;
                C193018gh c193018gh2 = c193028gi2.A01;
                switch (i) {
                    case 1:
                        interfaceC72008XEw = this.A02;
                        A02 = C66201U3x.A02("initial_render_start", i3);
                        interfaceC72008XEw.Cna(A02);
                        throw th;
                    case 2:
                        interfaceC72008XEw = this.A02;
                        A02 = C66201U3x.A02("initial_render_end", i3);
                        interfaceC72008XEw.Cna(A02);
                        throw th;
                    case 3:
                        InterfaceC72008XEw interfaceC72008XEw6 = this.A02;
                        interfaceC72008XEw6.Cna(C66201U3x.A02("initial_render_data_end", i3));
                        if (c66201U3x2.A01 == null) {
                            interfaceC72008XEw6.AF2(c193018gh2.A02, "bloks_query", true, c66201U3x2.A06.now());
                        }
                        C66273U6s c66273U6s2 = c66201U3x2.A05;
                        if (c66273U6s2.A09 != null && !c66273U6s2.A0I) {
                            throw th;
                        }
                        interfaceC72008XEw6.EoN("initial_content_step");
                        throw th;
                    case 4:
                        if (c193018gh2.A05) {
                            long j2 = c193018gh2.A04;
                            if (j2 > 0) {
                                interfaceC72008XEw = this.A02;
                                interfaceC72008XEw.Cnb(C66201U3x.A02("request_start", i3), j2);
                                A02 = C66201U3x.A02("request_end", i3);
                                interfaceC72008XEw.Cna(A02);
                                throw th;
                            }
                            throw th;
                        }
                        throw th;
                    case 5:
                        Throwable A052 = c66201U3x2.A05();
                        if (A052 != null) {
                            str = A052.getMessage();
                        }
                        this.A02.AUk(str);
                        throw th;
                    case 6:
                        interfaceC72008XEw = this.A02;
                        A02 = C66201U3x.A02("render_start", i3);
                        interfaceC72008XEw.Cna(A02);
                        throw th;
                    case 7:
                        interfaceC72008XEw2 = this.A02;
                        interfaceC72008XEw2.Cna(C66201U3x.A02("render_end", i3));
                        if (c66201U3x2.A0A.get() instanceof C215549gU) {
                            interfaceC72008XEw2.EoN("action_load_step");
                            C66201U3x.A03(c66201U3x2, interfaceC72008XEw2, c193028gi2);
                            throw th;
                        }
                        throw th;
                    case 8:
                    case 10:
                    default:
                        throw th;
                    case 9:
                        interfaceC72008XEw2 = this.A02;
                        interfaceC72008XEw2.Cna(C66201U3x.A02("render_data_end", i3));
                        C66201U3x.A03(c66201U3x2, interfaceC72008XEw2, c193028gi2);
                        throw th;
                    case 11:
                        interfaceC72008XEw = this.A02;
                        A02 = C66201U3x.A02("render_load_action_start", i3);
                        interfaceC72008XEw.Cna(A02);
                        throw th;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        interfaceC72008XEw = this.A02;
                        A02 = C66201U3x.A02("stream_on_load_actions_start", i3);
                        interfaceC72008XEw.Cna(A02);
                        throw th;
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        interfaceC72008XEw = this.A02;
                        A02 = C66201U3x.A02("stream_on_load_actions_end", i3);
                        interfaceC72008XEw.Cna(A02);
                        throw th;
                }
            }
            throw new IllegalArgumentException("Fetch summary is missing.");
        }
    }
}

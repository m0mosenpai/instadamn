package X;

import java.util.List;

/* renamed from: X.7xR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C179157xR implements InterfaceC179087xK, InterfaceC179167xS {
    public C178907x2 A01;
    public boolean A02;
    public C179427xs A03;
    public C179427xs A04;
    public final C178747wm A05;
    public final C1814082s A06 = new C1814082s();
    public float A00 = 1.0f;

    public final synchronized void A01(int i) {
        EnumC185798Lz enumC185798Lz;
        List list = this.A06.A00;
        C14360o3.A07(list);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C201598vo c201598vo = (C201598vo) list.get(i2);
            if (c201598vo instanceof InterfaceC179167xS) {
                C201528vh c201528vh = c201598vo.A07;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                enumC185798Lz = EnumC185798Lz.PEER;
                            } else {
                                enumC185798Lz = EnumC185798Lz.PREVIEW;
                            }
                        } else {
                            enumC185798Lz = EnumC185798Lz.OVERLAY;
                        }
                    } else {
                        enumC185798Lz = EnumC185798Lz.CAPTURE_IMAGE;
                    }
                } else {
                    enumC185798Lz = EnumC185798Lz.CAPTURE;
                }
                c201528vh.A00 = enumC185798Lz;
                c201528vh.A01 = ADA.A01(enumC185798Lz);
            }
        }
    }

    public final synchronized boolean A02() {
        List list = this.A06.A00;
        C14360o3.A07(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C201598vo c201598vo = (C201598vo) list.get(i);
            if (c201598vo instanceof InterfaceC179167xS) {
                C81A c81a = c201598vo.A03;
                if (c81a instanceof C81B) {
                    C14360o3.A0C(c81a, "null cannot be cast to non-null type com.facebook.videocodec.effects.common.OutputAwareGLRenderer");
                    if (((C81B) c81a).CZ1()) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC179087xK
    public final void ACv(InterfaceC180227zC interfaceC180227zC) {
    }

    @Override // X.InterfaceC179087xK
    public final void CNk(C178907x2 c178907x2) {
        C14360o3.A0B(c178907x2, 0);
        this.A01 = c178907x2;
    }

    @Override // X.InterfaceC179087xK
    public final void detach() {
    }

    @Override // X.InterfaceC179087xK
    public final synchronized void release() {
        this.A03 = null;
        this.A04 = null;
    }

    public static final C179427xs A00(C179157xR c179157xR) {
        C178907x2 c178907x2 = c179157xR.A01;
        if (c178907x2 != null) {
            if (c179157xR.A02) {
                C179427xs c179427xs = c179157xR.A03;
                if (c179427xs == null) {
                    C179427xs c179427xs2 = new C179427xs(c179157xR.A05, new C179387xo(), new C179417xr(), true);
                    c178907x2.A03(c179427xs2);
                    c179157xR.A03 = c179427xs2;
                    return c179427xs2;
                }
                return c179427xs;
            }
            C179427xs c179427xs3 = c179157xR.A04;
            if (c179427xs3 != null) {
                return c179427xs3;
            }
            C179427xs c179427xs4 = new C179427xs(c179157xR.A05, new C179387xo(), new C179417xr(), true);
            c178907x2.A03(c179427xs4);
            c179157xR.A04 = c179427xs4;
            return c179427xs4;
        }
        throw new IllegalStateException("GlRenderChain.init() must be called before getFrameBuffer()");
    }

    public C179157xR(C178747wm c178747wm) {
        this.A05 = c178747wm;
    }
}

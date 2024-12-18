package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes9.dex */
public final class MXn implements View.OnTouchListener, BDO {
    public int A00 = -1;
    public float A01 = -1.0f;
    public int A02 = -1;
    public boolean A03;
    public final /* synthetic */ C50643MXf A04;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean A1R = AbstractC167007dF.A1R(0, view, motionEvent);
        C50643MXf c50643MXf = this.A04;
        if (!c50643MXf.A0H || c50643MXf.A0B == null) {
            return false;
        }
        if (c50643MXf.A07 == null) {
            AbstractC12120kG.A07(C50643MXf.__redex_internal_original_name, "textureView is null", null);
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = -1;
        if (actionMasked != 0) {
            if (actionMasked != A1R) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return false;
                    }
                } else {
                    if (!c50643MXf.A0G) {
                        float A01 = AbstractC166987dD.A01(motionEvent.getRawX(), this.A01);
                        Context A0L = AbstractC166997dE.A0L(view);
                        int i2 = this.A00;
                        if (i2 == -1) {
                            i2 = AbstractC166987dD.A0C(A0L, 5);
                            this.A00 = i2;
                        }
                        if (A01 < i2) {
                            return A1R;
                        }
                    }
                    c50643MXf.A0G = A1R;
                    A00(motionEvent.getRawX() - this.A01);
                    this.A01 = motionEvent.getRawX();
                    return true;
                }
            } else if (!c50643MXf.A0G) {
                float x = motionEvent.getX();
                ViewGroup viewGroup = c50643MXf.A0N;
                if (x < AbstractC166987dD.A07(viewGroup) * 0.33333334f) {
                    C50643MXf.A06(c50643MXf, -1);
                } else if (motionEvent.getX() > AbstractC166987dD.A07(viewGroup) * 0.6666667f) {
                    C50643MXf.A06(c50643MXf, A1R ? 1 : 0);
                } else if (!(!this.A03)) {
                    c50643MXf.A0M.setVisibility(0);
                    this.A01 = -1.0f;
                    this.A02 = -1;
                }
            }
            InterfaceC58267PsB interfaceC58267PsB = c50643MXf.A0B;
            if (interfaceC58267PsB != null) {
                interfaceC58267PsB.start();
            }
            this.A01 = -1.0f;
            this.A02 = -1;
        } else {
            c50643MXf.A0M.setVisibility(8);
            InterfaceC58267PsB interfaceC58267PsB2 = c50643MXf.A0B;
            if (interfaceC58267PsB2 != null) {
                z = interfaceC58267PsB2.isPlaying();
            } else {
                z = false;
            }
            this.A03 = z;
            InterfaceC58267PsB interfaceC58267PsB3 = c50643MXf.A0B;
            if (interfaceC58267PsB3 != null) {
                interfaceC58267PsB3.pause();
            }
            InterfaceC58267PsB interfaceC58267PsB4 = c50643MXf.A0B;
            if (interfaceC58267PsB4 != null) {
                i = interfaceC58267PsB4.getCurrentPosition();
            }
            this.A02 = i;
            this.A01 = motionEvent.getRawX();
        }
        c50643MXf.A0G = false;
        return true;
    }

    public MXn(C50643MXf c50643MXf) {
        this.A04 = c50643MXf;
    }

    private final void A00(float f) {
        int i;
        int i2;
        C50643MXf c50643MXf = this.A04;
        TextureView textureView = c50643MXf.A07;
        if (c50643MXf.A0B != null && textureView != null) {
            float A07 = f / (AbstractC166987dD.A07(textureView) / 2.0f);
            C8RS c8rs = c50643MXf.A0A;
            C8RR c8rr = c50643MXf.A0X;
            if (c8rs == c8rr) {
                i2 = c50643MXf.A02;
                i = c50643MXf.A01;
            } else {
                i = c50643MXf.A0D.A00;
                i2 = 0;
            }
            int i3 = this.A02;
            int A00 = (int) AbstractC13600mm.A00(i3 + (A07 * (i - i2)), i2, i);
            if (Math.abs(A00 - i3) > 50 || (A00 == 0 && i3 != 0)) {
                if (c8rs == c8rr) {
                    c8rr.DzG(A00, 0, 0);
                }
                InterfaceC58267PsB interfaceC58267PsB = c50643MXf.A0B;
                if (interfaceC58267PsB != null) {
                    interfaceC58267PsB.seekTo(A00);
                }
                int i4 = this.A02;
                if (c50643MXf.A0A != c8rr) {
                    MXj mXj = c50643MXf.A0V;
                    if (NsX.A00(mXj, i4) != NsX.A00(mXj, A00)) {
                        AbstractC50523MSb.A0f();
                    }
                }
                this.A02 = A00;
            }
        }
    }

    @Override // X.BDO
    public final boolean CWH() {
        InterfaceC58267PsB interfaceC58267PsB;
        C50643MXf c50643MXf = this.A04;
        C8RS c8rs = c50643MXf.A0A;
        C8RR c8rr = c50643MXf.A0X;
        if (c8rs != c8rr || c8rr.A02 != C05F.A01 || (interfaceC58267PsB = c50643MXf.A0B) == null || !interfaceC58267PsB.isPlaying()) {
            return false;
        }
        return true;
    }

    @Override // X.BDO
    public final void Diu(float f) {
        InterfaceC58267PsB interfaceC58267PsB = this.A04.A0B;
        if (interfaceC58267PsB != null) {
            this.A02 = interfaceC58267PsB.getCurrentPosition();
            A00(f);
        }
    }

    @Override // X.BDO
    public final void Dmn() {
        C50643MXf c50643MXf = this.A04;
        InterfaceC58267PsB interfaceC58267PsB = c50643MXf.A0B;
        if (interfaceC58267PsB != null) {
            int i = 0;
            boolean isPlaying = interfaceC58267PsB.isPlaying();
            InterfaceC58267PsB interfaceC58267PsB2 = c50643MXf.A0B;
            if (isPlaying) {
                if (interfaceC58267PsB2 != null) {
                    interfaceC58267PsB2.pause();
                }
            } else if (interfaceC58267PsB2 != null) {
                interfaceC58267PsB2.start();
            }
            View view = c50643MXf.A0M;
            if (!isPlaying) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }
}

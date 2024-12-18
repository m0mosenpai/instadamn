package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.Oko, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnTouchListenerC55495Oko implements View.OnTouchListener, BDO {
    public int A00 = -1;
    public float A01 = -1.0f;
    public int A02 = -1;
    public boolean A03;
    public final /* synthetic */ C52135N5j A04;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean A1R = AbstractC167007dF.A1R(0, view, motionEvent);
        C52135N5j c52135N5j = this.A04;
        if (c52135N5j.A0E == null) {
            return false;
        }
        if (c52135N5j.A06 != null) {
            int actionMasked = motionEvent.getActionMasked();
            int i = -1;
            if (actionMasked != 0) {
                if (actionMasked != A1R) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            return false;
                        }
                    } else {
                        if (!c52135N5j.A0N) {
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
                        c52135N5j.A0N = A1R;
                        A00(motionEvent.getRawX() - this.A01);
                        this.A01 = motionEvent.getRawX();
                        return true;
                    }
                } else if (!c52135N5j.A0N) {
                    float x = motionEvent.getX();
                    ViewGroup viewGroup = c52135N5j.A08;
                    if (viewGroup != null) {
                        if (x < AbstractC166987dD.A07(viewGroup) * 0.33333334f) {
                            C52135N5j.A03(c52135N5j, -1);
                        } else {
                            float x2 = motionEvent.getX();
                            ViewGroup viewGroup2 = c52135N5j.A08;
                            if (viewGroup2 != null) {
                                if (x2 > AbstractC166987dD.A07(viewGroup2) * 0.6666667f) {
                                    C52135N5j.A03(c52135N5j, A1R ? 1 : 0);
                                } else if (!(!this.A03)) {
                                    View view2 = c52135N5j.A07;
                                    if (view2 != null) {
                                        view2.setVisibility(0);
                                        this.A01 = -1.0f;
                                        this.A02 = -1;
                                        c52135N5j.A0N = false;
                                        return true;
                                    }
                                    C14360o3.A0F("playButton");
                                }
                            }
                        }
                    }
                    C14360o3.A0F("clipsReviewContainer");
                }
                InterfaceC58267PsB interfaceC58267PsB = c52135N5j.A0E;
                if (interfaceC58267PsB != null) {
                    interfaceC58267PsB.start();
                }
                this.A01 = -1.0f;
                this.A02 = -1;
                c52135N5j.A0N = false;
                return true;
            }
            View view3 = c52135N5j.A07;
            if (view3 != null) {
                view3.setVisibility(8);
                InterfaceC58267PsB interfaceC58267PsB2 = c52135N5j.A0E;
                if (interfaceC58267PsB2 != null) {
                    z = interfaceC58267PsB2.isPlaying();
                } else {
                    z = false;
                }
                this.A03 = z;
                InterfaceC58267PsB interfaceC58267PsB3 = c52135N5j.A0E;
                if (interfaceC58267PsB3 != null) {
                    interfaceC58267PsB3.pause();
                }
                InterfaceC58267PsB interfaceC58267PsB4 = c52135N5j.A0E;
                if (interfaceC58267PsB4 != null) {
                    i = interfaceC58267PsB4.getCurrentPosition();
                }
                this.A02 = i;
                this.A01 = motionEvent.getRawX();
                c52135N5j.A0N = false;
                return true;
            }
            C14360o3.A0F("playButton");
            throw C00O.createAndThrow();
        }
        throw AbstractC166997dE.A0g();
    }

    public ViewOnTouchListenerC55495Oko(C52135N5j c52135N5j) {
        this.A04 = c52135N5j;
    }

    private final void A00(float f) {
        int i;
        int i2;
        C52135N5j c52135N5j = this.A04;
        TextureView textureView = c52135N5j.A06;
        if (c52135N5j.A0E != null && textureView != null) {
            float A07 = f / (AbstractC166987dD.A07(textureView) / 2.0f);
            C8RS c8rs = c52135N5j.A0C;
            if (c8rs != null) {
                C8RR c8rr = c52135N5j.A0G;
                String str = "clipsReviewTrimMode";
                if (c8rr != null) {
                    if (c8rs == c8rr) {
                        i2 = c52135N5j.A01;
                        i = c52135N5j.A00;
                    } else {
                        i = C51033Mgh.A01(c52135N5j.A0X).A00;
                        i2 = 0;
                    }
                    int i3 = this.A02;
                    int A00 = (int) AbstractC13600mm.A00(i3 + (A07 * (i - i2)), i2, i);
                    if (Math.abs(A00 - i3) > 50 || (A00 == 0 && i3 != 0)) {
                        C8RS c8rs2 = c52135N5j.A0C;
                        if (c8rs2 != null) {
                            C8RR c8rr2 = c52135N5j.A0G;
                            if (c8rr2 != null) {
                                if (c8rs2 == c8rr2) {
                                    c8rr2.DzG(A00, 0, 0);
                                }
                                InterfaceC58267PsB interfaceC58267PsB = c52135N5j.A0E;
                                if (interfaceC58267PsB != null) {
                                    interfaceC58267PsB.seekTo(A00);
                                }
                                int i4 = this.A02;
                                C8RS c8rs3 = c52135N5j.A0C;
                                if (c8rs3 == null) {
                                    str = "currentReviewMode";
                                } else {
                                    C8RR c8rr3 = c52135N5j.A0G;
                                    if (c8rr3 != null) {
                                        if (c8rs3 != c8rr3) {
                                            C56278Oyn c56278Oyn = c52135N5j.A0T;
                                            if (NsX.A00(c56278Oyn, i4) != NsX.A00(c56278Oyn, A00)) {
                                                AbstractC50523MSb.A0f();
                                            }
                                        }
                                        this.A02 = A00;
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            C14360o3.A0F("currentReviewMode");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.BDO
    public final boolean CWH() {
        String str;
        InterfaceC58267PsB interfaceC58267PsB;
        C52135N5j c52135N5j = this.A04;
        C8RS c8rs = c52135N5j.A0C;
        if (c8rs == null) {
            str = "currentReviewMode";
        } else {
            C8RR c8rr = c52135N5j.A0G;
            str = "clipsReviewTrimMode";
            if (c8rr != null) {
                if (c8rs != c8rr || c8rr.A02 != C05F.A01 || (interfaceC58267PsB = c52135N5j.A0E) == null || !interfaceC58267PsB.isPlaying()) {
                    return false;
                }
                return true;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.BDO
    public final void Diu(float f) {
        InterfaceC58267PsB interfaceC58267PsB = this.A04.A0E;
        if (interfaceC58267PsB != null) {
            this.A02 = interfaceC58267PsB.getCurrentPosition();
            A00(f);
        }
    }

    @Override // X.BDO
    public final void Dmn() {
        C52135N5j c52135N5j = this.A04;
        InterfaceC58267PsB interfaceC58267PsB = c52135N5j.A0E;
        if (interfaceC58267PsB != null) {
            int i = 0;
            boolean isPlaying = interfaceC58267PsB.isPlaying();
            InterfaceC58267PsB interfaceC58267PsB2 = c52135N5j.A0E;
            if (isPlaying) {
                if (interfaceC58267PsB2 != null) {
                    interfaceC58267PsB2.pause();
                }
            } else if (interfaceC58267PsB2 != null) {
                interfaceC58267PsB2.start();
            }
            View view = c52135N5j.A07;
            if (view == null) {
                C14360o3.A0F("playButton");
                throw C00O.createAndThrow();
            }
            if (!isPlaying) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }
}

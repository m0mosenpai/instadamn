package X;

import android.os.SystemClock;
import android.view.MotionEvent;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class Sb5 {
    public static int A06;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public InterfaceC65363Tiv A04;
    public boolean A05;

    public final int A03() {
        Integer num;
        if ((this instanceof R6D) && (num = ((R6D) this).A03) != null) {
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue != 1 && intValue != 3) {
                    if (intValue == 2) {
                        return 4;
                    }
                    throw B4Z.A00();
                }
                return 1;
            }
            return 0;
        }
        return 2;
    }

    public InterfaceC65657Tqj A04() {
        if (this instanceof R69) {
            R69 r69 = (R69) this;
            WritableNativeMap A0c = AbstractC58321PtD.A0c();
            A0c.putInt("target", r69.A02);
            A0c.putBoolean(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, r69.A00);
            return A0c;
        }
        if (this instanceof R68) {
            return ((R68) this).A00;
        }
        if (this instanceof R6B) {
            R6B r6b = (R6B) this;
            WritableNativeMap A0c2 = AbstractC58321PtD.A0c();
            A0c2.putString("data", r6b.A00);
            A0c2.putString("origin", r6b.A01);
            return A0c2;
        }
        if (this instanceof R67) {
            return ((R67) this).A00;
        }
        if (this instanceof R66) {
            return ((R66) this).A00;
        }
        if (this instanceof R65) {
            return ((R65) this).A00;
        }
        if (this instanceof R6A) {
            R6A r6a = (R6A) this;
            WritableNativeMap A0c3 = AbstractC58321PtD.A0c();
            A0c3.putDouble(IgReactMediaPickerNativeModule.WIDTH, AbstractC58321PtD.A00(r6a.A01));
            A0c3.putDouble(IgReactMediaPickerNativeModule.HEIGHT, AbstractC58321PtD.A00(r6a.A00));
            return A0c3;
        }
        if (this instanceof R64) {
            return AbstractC58321PtD.A0c();
        }
        if (this instanceof R63) {
            return AbstractC58321PtD.A0c();
        }
        if (this instanceof R6C) {
            R6C r6c = (R6C) this;
            WritableNativeMap A0c4 = AbstractC58321PtD.A0c();
            A0c4.putDouble("x", AbstractC58321PtD.A00(r6c.A02));
            A0c4.putDouble("y", AbstractC58321PtD.A00(r6c.A03));
            A0c4.putDouble(IgReactMediaPickerNativeModule.WIDTH, AbstractC58321PtD.A00(r6c.A01));
            A0c4.putDouble(IgReactMediaPickerNativeModule.HEIGHT, AbstractC58321PtD.A00(r6c.A00));
            WritableNativeMap A0c5 = AbstractC58321PtD.A0c();
            A0c5.putMap("layout", A0c4);
            A0c5.putInt("target", ((Sb5) r6c).A02);
            return A0c5;
        }
        return null;
    }

    public String A05() {
        if (this instanceof R69) {
            return "topChange";
        }
        if (this instanceof R68) {
            return "topShouldStartLoadWithRequest";
        }
        if (this instanceof R6B) {
            return "topMessage";
        }
        if (this instanceof R67) {
            return "topLoadingStart";
        }
        if (this instanceof R66) {
            return "topLoadingFinish";
        }
        if (this instanceof R65) {
            return "topLoadingError";
        }
        if (this instanceof R6A) {
            return "topContentSizeChange";
        }
        if (this instanceof R64) {
            return "topShow";
        }
        if (this instanceof R63) {
            return "topRequestClose";
        }
        if (this instanceof R6D) {
            Integer num = ((R6D) this).A03;
            AbstractC05810Sj.A00(num);
            C14360o3.A07(num);
            return C62799SRt.A00(num);
        }
        if (this instanceof R6E) {
            return ((R6E) this).A03;
        }
        return "topLayout";
    }

    public short A06() {
        if (this instanceof R6D) {
            return ((R6D) this).A04;
        }
        if (this instanceof R6E) {
            return ((R6E) this).A05;
        }
        return (short) 0;
    }

    public void A07() {
        String str;
        if (this instanceof R6D) {
            R6D r6d = (R6D) this;
            MotionEvent motionEvent = r6d.A02;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
            r6d.A02 = null;
            try {
                R6D.A05.EE6(r6d);
                return;
            } catch (IllegalStateException e) {
                e = e;
                str = "TouchEvent";
            }
        } else if (this instanceof R6E) {
            R6E r6e = (R6E) this;
            r6e.A04 = null;
            MotionEvent motionEvent2 = r6e.A00;
            r6e.A00 = null;
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            try {
                R6E.A06.EE6(r6e);
                return;
            } catch (IllegalStateException e2) {
                e = e2;
                str = "PointerEvent";
            }
        } else {
            if (this instanceof R6C) {
                R6C.A04.EE6(this);
                return;
            }
            return;
        }
        ReactSoftExceptionLogger.logSoftException(str, e);
    }

    @Deprecated
    public void A09(RCTEventEmitter rCTEventEmitter) {
        if (this instanceof R6D) {
            R6D r6d = (R6D) this;
            C14360o3.A0B(rCTEventEmitter, 0);
            if (r6d.A02 == null) {
                ReactSoftExceptionLogger.logSoftException("TouchEvent", AbstractC166987dD.A14("Cannot dispatch a TouchEvent that has no MotionEvent; the TouchEvent has been recycled"));
                return;
            } else {
                C63054Sbb.A00(rCTEventEmitter, r6d);
                return;
            }
        }
        if (this instanceof R6E) {
            R6E r6e = (R6E) this;
            if (r6e.A00 == null) {
                ReactSoftExceptionLogger.logSoftException("PointerEvent", AbstractC166987dD.A14("Cannot dispatch a Pointer that has no MotionEvent; the PointerEvehas been recycled"));
                return;
            }
            List list = r6e.A04;
            if (list == null) {
                list = R6E.A02(r6e);
                r6e.A04 = list;
                if (list == null) {
                    return;
                }
            }
            boolean z = true;
            if (list.size() <= 1) {
                z = false;
            }
            for (InterfaceC65657Tqj interfaceC65657Tqj : r6e.A04) {
                if (z) {
                    interfaceC65657Tqj = interfaceC65657Tqj.copy();
                }
                rCTEventEmitter.receiveEvent(((Sb5) r6e).A02, r6e.A03, interfaceC65657Tqj);
            }
            return;
        }
        rCTEventEmitter.receiveEvent(this.A02, A05(), A04());
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0074. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0A(com.facebook.react.uimanager.events.RCTModernEventEmitter r13) {
        /*
            r12 = this;
            boolean r0 = r12 instanceof X.R6D
            r4 = r13
            if (r0 == 0) goto L1c
            r1 = r12
            X.R6D r1 = (X.R6D) r1
            r0 = 0
            X.C14360o3.A0B(r13, r0)
            android.view.MotionEvent r0 = r1.A02
            if (r0 != 0) goto La8
            java.lang.String r1 = "TouchEvent"
            java.lang.String r0 = "Cannot dispatch a TouchEvent that has no MotionEvent; the TouchEvent has been recycled"
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            com.facebook.react.bridge.ReactSoftExceptionLogger.logSoftException(r1, r0)
        L1b:
            return
        L1c:
            boolean r0 = r12 instanceof X.R6E
            if (r0 == 0) goto Lac
            r1 = r12
            X.R6E r1 = (X.R6E) r1
            android.view.MotionEvent r0 = r1.A00
            if (r0 != 0) goto L33
            java.lang.String r1 = "PointerEvent"
            java.lang.String r0 = "Cannot dispatch a Pointer that has no MotionEvent; the PointerEvehas been recycled"
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            com.facebook.react.bridge.ReactSoftExceptionLogger.logSoftException(r1, r0)
            return
        L33:
            java.util.List r0 = r1.A04
            if (r0 != 0) goto L40
            java.util.List r0 = X.R6E.A02(r1)
            r1.A04 = r0
            if (r0 != 0) goto L40
            return
        L40:
            int r2 = r0.size()
            r0 = 1
            boolean r3 = X.AbstractC25230BEn.A1S(r2, r0)
            java.util.List r0 = r1.A04
            java.util.Iterator r2 = r0.iterator()
        L4f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1b
            java.lang.Object r10 = r2.next()
            X.Tqj r10 = (X.InterfaceC65657Tqj) r10
            if (r3 == 0) goto L61
            X.Tqj r10 = r10.copy()
        L61:
            int r5 = r1.A00
            int r6 = r1.A02
            java.lang.String r7 = r1.A03
            short r9 = r1.A05
            r0 = -1
            boolean r8 = X.MSY.A1S(r9, r0)
            if (r7 == 0) goto L77
            int r0 = r7.hashCode()
            switch(r0) {
                case -1786514288: goto L9d;
                case -1780335505: goto L99;
                case -1304584214: goto L90;
                case -1304316135: goto L8c;
                case -1304250340: goto L88;
                case -1065042973: goto L84;
                case 383186882: goto L80;
                case 1343400710: goto L7c;
                default: goto L77;
            }
        L77:
            r11 = 2
        L78:
            r4.receiveEvent(r5, r6, r7, r8, r9, r10, r11)
            goto L4f
        L7c:
            java.lang.String r0 = "topPointerOut"
            goto La0
        L80:
            java.lang.String r0 = "topPointerCancel"
            goto L93
        L84:
            java.lang.String r0 = "topPointerUp"
            goto L93
        L88:
            java.lang.String r0 = "topPointerOver"
            goto La0
        L8c:
            java.lang.String r0 = "topPointerMove"
            goto La0
        L90:
            java.lang.String r0 = "topPointerDown"
        L93:
            boolean r0 = r7.equals(r0)
            r11 = 3
            goto La5
        L99:
            java.lang.String r0 = "topPointerLeave"
            goto La0
        L9d:
            java.lang.String r0 = "topPointerEnter"
        La0:
            boolean r0 = r7.equals(r0)
            r11 = 4
        La5:
            if (r0 != 0) goto L78
            goto L77
        La8:
            r13.receiveTouches(r1)
            return
        Lac:
            int r5 = r12.A00
            r0 = -1
            if (r5 == r0) goto Lcb
            int r6 = r12.A02
            java.lang.String r7 = r12.A05()
            boolean r8 = r12.A0B()
            short r9 = r12.A06()
            X.Tqj r10 = r12.A04()
            int r11 = r12.A03()
            r4.receiveEvent(r5, r6, r7, r8, r9, r10, r11)
            return
        Lcb:
            r12.A09(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Sb5.A0A(com.facebook.react.uimanager.events.RCTModernEventEmitter):void");
    }

    public boolean A0B() {
        if (!(this instanceof R68) && !(this instanceof R6B) && !(this instanceof R67) && !(this instanceof R66) && !(this instanceof R65)) {
            if (this instanceof R6D) {
                R6D r6d = (R6D) this;
                Integer num = r6d.A03;
                AbstractC05810Sj.A00(num);
                if (num != null) {
                    int intValue = num.intValue();
                    if (intValue != 0 && intValue != 1 && intValue != 3) {
                        if (intValue == 2) {
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
                throw MSY.A0d("Unknown touch event type: ", AbstractC62170S0r.A00(r6d.A03));
            }
            return true;
        }
        return false;
    }

    public Sb5(int i, int i2) {
        int i3 = A06;
        A06 = i3 + 1;
        this.A01 = i3;
        A08(i, i2);
    }

    public final void A08(int i, int i2) {
        long uptimeMillis = SystemClock.uptimeMillis();
        this.A00 = i;
        this.A02 = i2;
        this.A03 = uptimeMillis;
        this.A05 = true;
    }

    public Sb5() {
        int i = A06;
        A06 = i + 1;
        this.A01 = i;
    }
}

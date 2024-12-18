package X;

import android.content.ClipData;
import android.content.Context;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;

/* renamed from: X.7QF, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7QF extends C7QG {
    public final Context A00;
    public final C162897Ra A01;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7QF(View view, C162897Ra c162897Ra, C7Q6 c7q6, C7Q8 c7q8, C7QA c7qa, InterfaceC165507ad interfaceC165507ad, Object obj, boolean z, boolean z2, boolean z3) {
        this(view, c162897Ra, c7q6, c7q8, c7qa, interfaceC165507ad, null, obj, z, z2, z3);
        C14360o3.A0B(c7q6, 1);
        C14360o3.A0B(c7q8, 2);
        C14360o3.A0B(c7qa, 3);
        C14360o3.A0B(interfaceC165507ad, 5);
        C14360o3.A0B(view, 7);
    }

    @Override // X.C7QG, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        InterfaceC129525tH interfaceC129525tH = (InterfaceC129525tH) super.A00;
        if (interfaceC129525tH != null && interfaceC129525tH.ARd()) {
            super.onLongPress(motionEvent);
        }
    }

    public C7QF(final View view, C162897Ra c162897Ra, final C7Q6 c7q6, final C7Q8 c7q8, final C7QA c7qa, InterfaceC165507ad interfaceC165507ad, final C1580277m c1580277m, final Object obj, boolean z, boolean z2, final boolean z3) {
        super(view, (InterfaceC165077Zw) interfaceC165507ad, new C7QJ() { // from class: X.7QI
            @Override // X.C7QJ
            public final /* bridge */ /* synthetic */ boolean DT5(MotionEvent motionEvent, Object obj2) {
                C14360o3.A0B(motionEvent, 1);
                return c7q6.DT4(motionEvent, obj2, obj);
            }

            @Override // X.C7QJ
            public final /* bridge */ /* synthetic */ void DTA(MotionEvent motionEvent, Object obj2, boolean z4) {
                C14360o3.A0B(motionEvent, 1);
                c7qa.DTA(motionEvent, obj2, z4);
                if (z3) {
                    try {
                        view.startDragAndDrop(ClipData.newPlainText("message_long_press_drag", ""), new C25729BYp(), null, 0);
                    } catch (Surface.OutOfResourcesException | IllegalStateException unused) {
                    }
                }
            }

            @Override // X.C7QJ
            public final /* bridge */ /* synthetic */ boolean DBa(Object obj2) {
                return c7q8.DBb(obj2, obj);
            }

            @Override // X.C7QJ
            public final /* bridge */ /* synthetic */ boolean Dtz(MotionEvent motionEvent, Object obj2) {
                InterfaceC129525tH interfaceC129525tH = (InterfaceC129525tH) obj2;
                C1580277m c1580277m2 = c1580277m;
                if (c1580277m2 != null) {
                    InterfaceC165077Zw interfaceC165077Zw = c1580277m2.A00;
                    KTJ ktj = (KTJ) interfaceC129525tH;
                    if (ktj.A02 == C05F.A01) {
                        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                            ((InterfaceC165627ap) interfaceC165077Zw).CMk(ktj.BSy().A01);
                            ((C7W6) interfaceC165077Zw).ARo(true);
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
        }, z, z2);
        this.A01 = c162897Ra;
        Context context = view.getContext();
        C14360o3.A07(context);
        this.A00 = context;
    }
}

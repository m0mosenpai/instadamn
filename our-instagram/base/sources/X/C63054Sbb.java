package X;

import android.view.MotionEvent;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: X.Sbb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63054Sbb {
    public static void A00(RCTEventEmitter rCTEventEmitter, R6D r6d) {
        Integer num = r6d.A03;
        AbstractC05810Sj.A00(num);
        C14360o3.A07(num);
        InterfaceC65657Tqj[] A01 = A01(r6d);
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (InterfaceC65657Tqj interfaceC65657Tqj : A01) {
            if (interfaceC65657Tqj != null) {
                writableNativeArray.pushMap(interfaceC65657Tqj);
            }
        }
        MotionEvent motionEvent = r6d.A02;
        AbstractC05810Sj.A00(motionEvent);
        C14360o3.A07(motionEvent);
        InterfaceC65656Tqi writableNativeArray2 = new WritableNativeArray();
        if (num != C05F.A0C && num != C05F.A0N) {
            if (num != C05F.A00 && num != C05F.A01) {
                throw MSY.A0d("Unknown touch type: ", AbstractC62170S0r.A00(num));
            }
            writableNativeArray2.pushInt(motionEvent.getActionIndex());
        } else {
            for (int i = 0; i < motionEvent.getPointerCount(); i++) {
                writableNativeArray2.pushInt(i);
            }
        }
        rCTEventEmitter.receiveTouches(C62799SRt.A00(num), writableNativeArray, writableNativeArray2);
    }

    public static InterfaceC65657Tqj[] A01(R6D r6d) {
        MotionEvent motionEvent = r6d.A02;
        AbstractC05810Sj.A00(motionEvent);
        C14360o3.A07(motionEvent);
        InterfaceC65657Tqj[] interfaceC65657TqjArr = new InterfaceC65657Tqj[motionEvent.getPointerCount()];
        float x = motionEvent.getX() - r6d.A00;
        float y = motionEvent.getY() - r6d.A01;
        for (int i = 0; i < motionEvent.getPointerCount(); i++) {
            WritableNativeMap A0c = AbstractC58321PtD.A0c();
            A0c.putDouble("pageX", WF1.A00(motionEvent.getX(i)));
            A0c.putDouble("pageY", WF1.A00(motionEvent.getY(i)));
            float x2 = motionEvent.getX(i) - x;
            float y2 = motionEvent.getY(i) - y;
            A0c.putDouble("locationX", WF1.A00(x2));
            A0c.putDouble("locationY", WF1.A00(y2));
            A0c.putInt("targetSurface", ((Sb5) r6d).A00);
            A0c.putInt("target", ((Sb5) r6d).A02);
            A0c.putDouble("timestamp", ((Sb5) r6d).A03);
            A0c.putDouble("identifier", motionEvent.getPointerId(i));
            interfaceC65657TqjArr[i] = A0c;
        }
        return interfaceC65657TqjArr;
    }
}

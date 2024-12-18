package com.facebook.react.animated;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC25226BEj;
import X.AbstractC25233BEq;
import X.AbstractC58320PtC;
import X.C14360o3;
import X.InterfaceC65656Tqi;
import X.InterfaceC65657Tqj;
import X.MSX;
import X.R2f;
import X.R6D;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.events.RCTModernEventEmitter;
import java.util.List;

/* loaded from: classes10.dex */
public final class EventAnimationDriver implements RCTModernEventEmitter {
    public String eventName;
    public final List eventPath;
    public R2f valueNode;
    public int viewTag;

    public EventAnimationDriver(String str, int i, List list, R2f r2f) {
        AbstractC25233BEq.A0w(1, str, list, r2f);
        this.eventName = str;
        this.viewTag = i;
        this.eventPath = list;
        this.valueNode = r2f;
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int i, int i2, String str, InterfaceC65657Tqj interfaceC65657Tqj) {
        C14360o3.A0B(str, 2);
        receiveEvent(i, i2, str, false, 0, interfaceC65657Tqj, 2);
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveTouches(R6D r6d) {
        throw AbstractC166987dD.A1D("receiveTouches is not support by native animated events");
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveEvent(int i, String str, InterfaceC65657Tqj interfaceC65657Tqj) {
        C14360o3.A0B(str, 1);
        receiveEvent(-1, i, str, interfaceC65657Tqj);
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveTouches(String str, InterfaceC65656Tqi interfaceC65656Tqi, InterfaceC65656Tqi interfaceC65656Tqi2) {
        throw AbstractC166987dD.A1D("receiveTouches is not support by native animated events");
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int i, int i2, String str, boolean z, int i3, InterfaceC65657Tqj interfaceC65657Tqj, int i4) {
        R2f r2f;
        double d;
        ReadableType readableType;
        InterfaceC65657Tqj interfaceC65657Tqj2;
        if (interfaceC65657Tqj != null) {
            int i5 = 0;
            int A05 = AbstractC25226BEj.A05(this.eventPath);
            ReadableArray readableArray = null;
            InterfaceC65657Tqj interfaceC65657Tqj3 = interfaceC65657Tqj;
            while (i5 < A05) {
                List list = this.eventPath;
                if (interfaceC65657Tqj3 != null) {
                    String A1I = AbstractC25226BEj.A1I(list, i5);
                    ReadableType type = interfaceC65657Tqj3.getType(A1I);
                    if (type == ReadableType.Map) {
                        interfaceC65657Tqj2 = interfaceC65657Tqj3.getMap(A1I);
                        readableArray = null;
                    } else if (type == ReadableType.Array) {
                        readableArray = interfaceC65657Tqj3.getArray(A1I);
                        interfaceC65657Tqj2 = null;
                    } else {
                        StringBuilder A11 = AbstractC166997dE.A11("Unexpected type ");
                        A11.append(type);
                        A11.append(" for key '");
                        A11.append(A1I);
                        String A0l = MSX.A0l(A11, '\'');
                        C14360o3.A0B(A0l, 1);
                        throw new RuntimeException(A0l);
                    }
                } else {
                    int A0C = AbstractC167007dF.A0C(list, i5);
                    if (readableArray != null) {
                        readableType = readableArray.getType(A0C);
                    } else {
                        readableType = null;
                    }
                    if (readableType == ReadableType.Map) {
                        if (readableArray != null) {
                            interfaceC65657Tqj2 = readableArray.getMap(A0C);
                        } else {
                            interfaceC65657Tqj2 = null;
                        }
                        readableArray = null;
                    } else if (readableType == ReadableType.Array) {
                        if (readableArray != null) {
                            readableArray = readableArray.getArray(A0C);
                        } else {
                            readableArray = null;
                        }
                        interfaceC65657Tqj2 = null;
                    } else {
                        StringBuilder A112 = AbstractC166997dE.A11("Unexpected type ");
                        A112.append(readableType);
                        A112.append(" for index '");
                        A112.append(A0C);
                        String A0l2 = MSX.A0l(A112, '\'');
                        C14360o3.A0B(A0l2, 1);
                        throw new RuntimeException(A0l2);
                    }
                }
                i5++;
                interfaceC65657Tqj3 = interfaceC65657Tqj2;
            }
            String str2 = (String) AbstractC58320PtC.A0u(this.eventPath);
            if (interfaceC65657Tqj3 != null) {
                r2f = this.valueNode;
                d = interfaceC65657Tqj3.getDouble(str2);
            } else {
                int parseInt = Integer.parseInt(str2);
                r2f = this.valueNode;
                d = readableArray != null ? readableArray.getDouble(parseInt) : 0.0d;
            }
            r2f.A00 = d;
            return;
        }
        throw AbstractC166987dD.A12("Native animated events must have event data.");
    }
}

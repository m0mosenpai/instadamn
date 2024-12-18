package com.facebook.rsys.messagequeue.gen;

import X.AbstractC166987dD;
import X.C2N9;
import X.JQ0;
import X.LSW;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public class MessageQueue {
    public static C2N9 CONVERTER = new LSW(9);
    public static long sMcfTypeId;
    public final ArrayList items;
    public final String name;

    public static native MessageQueue createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageQueue)) {
            return false;
        }
        MessageQueue messageQueue = (MessageQueue) obj;
        return this.name.equals(messageQueue.name) && this.items.equals(messageQueue.items);
    }

    public int hashCode() {
        return AbstractC166987dD.A0I(this.items, JQ0.A01(this.name.hashCode()));
    }

    public MessageQueue(String str, ArrayList arrayList) {
        str.getClass();
        arrayList.getClass();
        this.name = str;
        this.items = arrayList;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MessageQueue{name=");
        A1C.append(this.name);
        A1C.append(",items=");
        return JQ0.A0l(this.items, A1C);
    }
}

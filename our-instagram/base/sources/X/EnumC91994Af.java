package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.4Af, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC91994Af implements InterfaceC92004Ag {
    DID_ENTER_PREFETCH_QUEUE,
    DID_EXIT_PREFETCH_QUEUE,
    DID_ENTER_TASK_QUEUE,
    DID_ENTER_TASK_QUEUE_DASH_AUDIO,
    DID_ENTER_TASK_QUEUE_DASH_VIDEO,
    DID_EXIT_TASK_QUEUE,
    DID_EXIT_TASK_QUEUE_DASH_AUDIO,
    DID_EXIT_TASK_QUEUE_DASH_VIDEO,
    SUCCESS,
    SUCCESS_DASH_AUDIO,
    SUCCESS_DASH_VIDEO;

    public static Map A00;
    public static Map A01;
    public static Map A02;

    static {
        EnumC91994Af enumC91994Af = DID_ENTER_PREFETCH_QUEUE;
        EnumC91994Af enumC91994Af2 = DID_EXIT_PREFETCH_QUEUE;
        EnumC91994Af enumC91994Af3 = DID_ENTER_TASK_QUEUE;
        EnumC91994Af enumC91994Af4 = DID_ENTER_TASK_QUEUE_DASH_AUDIO;
        EnumC91994Af enumC91994Af5 = DID_ENTER_TASK_QUEUE_DASH_VIDEO;
        EnumC91994Af enumC91994Af6 = DID_EXIT_TASK_QUEUE;
        EnumC91994Af enumC91994Af7 = DID_EXIT_TASK_QUEUE_DASH_AUDIO;
        EnumC91994Af enumC91994Af8 = DID_EXIT_TASK_QUEUE_DASH_VIDEO;
        EnumC91994Af enumC91994Af9 = SUCCESS;
        EnumC91994Af enumC91994Af10 = SUCCESS_DASH_AUDIO;
        EnumC91994Af enumC91994Af11 = SUCCESS_DASH_VIDEO;
        HashMap hashMap = new HashMap();
        A01 = hashMap;
        hashMap.put(enumC91994Af, enumC91994Af);
        A01.put(enumC91994Af2, enumC91994Af2);
        A01.put(enumC91994Af3, enumC91994Af3);
        A01.put(enumC91994Af6, enumC91994Af6);
        A01.put(enumC91994Af9, enumC91994Af9);
        HashMap hashMap2 = new HashMap(A01);
        A00 = hashMap2;
        hashMap2.put(enumC91994Af3, enumC91994Af4);
        A00.put(enumC91994Af6, enumC91994Af7);
        A00.put(enumC91994Af9, enumC91994Af10);
        HashMap hashMap3 = new HashMap(A01);
        A02 = hashMap3;
        hashMap3.put(enumC91994Af3, enumC91994Af5);
        A02.put(enumC91994Af6, enumC91994Af8);
        A02.put(enumC91994Af9, enumC91994Af11);
    }

    public static EnumC91994Af A00(EnumC91984Ae enumC91984Ae, EnumC91994Af enumC91994Af) {
        Map map;
        int ordinal = enumC91984Ae.ordinal();
        if (ordinal != 2) {
            if (ordinal != 1) {
                map = A01;
            } else {
                map = A02;
            }
        } else {
            map = A00;
        }
        return (EnumC91994Af) map.get(enumC91994Af);
    }
}

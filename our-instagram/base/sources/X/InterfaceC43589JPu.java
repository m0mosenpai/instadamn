package X;

/* renamed from: X.JPu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC43589JPu extends C1M1 {
    String Amq();

    String CGJ();

    static void A00(InterfaceC02590Ai interfaceC02590Ai, InterfaceC43589JPu interfaceC43589JPu) {
        interfaceC02590Ai.AAP("viewer_session_id", interfaceC43589JPu.CGJ());
    }

    static void A01(InterfaceC02590Ai interfaceC02590Ai, InterfaceC43589JPu interfaceC43589JPu) {
        interfaceC02590Ai.AAP("chaining_session_id", interfaceC43589JPu.Amq());
    }
}

package X;

import android.graphics.Path;
import java.util.List;

/* renamed from: X.Ktc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47203Ktc {
    public static final Path A00;
    public static final List A01;
    public static final List A02;
    public static final Path A03;

    static {
        List<C47808L9q> A1Q = AbstractC16960so.A1Q(new C47808L9q(0.0f, 42.081f, 0.0f, 42.081f, 2.447f, 34.549f), new C47808L9q(4.894f, 27.018f, 4.894f, 27.018f, 9.549f, 20.611f), new C47808L9q(11.877f, 17.407f, 13.04f, 15.806f, 14.423f, 14.423f), new C47808L9q(15.806f, 13.04f, 17.407f, 11.877f, 20.611f, 9.549f), new C47808L9q(27.018f, 4.894f, 27.018f, 4.894f, 34.549f, 2.447f), new C47808L9q(42.081f, 0.0f, 42.081f, 0.0f, 50.0f, 0.0f), new C47808L9q(57.919f, 0.0f, 57.919f, 0.0f, 65.451f, 2.447f), new C47808L9q(72.982f, 4.894f, 72.982f, 4.894f, 79.389f, 9.549f), new C47808L9q(85.796f, 14.204f, 85.796f, 14.204f, 90.451f, 20.611f), new C47808L9q(95.106f, 27.018f, 95.106f, 27.018f, 97.553f, 34.549f), new C47808L9q(100.0f, 42.081f, 100.0f, 42.081f, 100.0f, 50.0f), new C47808L9q(100.0f, 57.919f, 100.0f, 57.919f, 97.553f, 65.451f), new C47808L9q(95.106f, 72.982f, 95.106f, 72.982f, 90.451f, 79.389f), new C47808L9q(85.796f, 85.796f, 85.796f, 85.796f, 79.389f, 90.451f), new C47808L9q(72.982f, 95.106f, 72.982f, 95.106f, 65.451f, 97.553f), new C47808L9q(57.919f, 100.0f, 57.919f, 100.0f, 50.0f, 100.0f), new C47808L9q(42.081f, 100.0f, 42.081f, 100.0f, 34.549f, 97.553f), new C47808L9q(27.018f, 95.106f, 27.018f, 95.106f, 20.611f, 90.451f), new C47808L9q(14.204f, 85.796f, 14.204f, 85.796f, 9.549f, 79.389f), new C47808L9q(4.894f, 72.982f, 4.894f, 72.982f, 2.447f, 65.451f), new C47808L9q(0.0f, 57.919f, 0.0f, 57.919f, 0.0f, 50.0f));
        A01 = A1Q;
        A02 = AbstractC16960so.A1Q(new C47808L9q(0.0f, 47.4f, 1.6f, 45.1f, 4.0f, 44.0f), new C47808L9q(12.667f, 40.333f, 21.333f, 36.667f, 30.0f, 33.0f), new C47808L9q(31.5f, 32.4f, 32.3f, 31.5f, 33.0f, 30.0f), new C47808L9q(34.833f, 25.667f, 36.667f, 21.333f, 38.5f, 17.0f), new C47808L9q(40.333f, 12.667f, 42.167f, 8.333f, 44.0f, 4.0f), new C47808L9q(45.1f, 1.6f, 47.4f, 0.0f, 50.0f, 0.0f), new C47808L9q(52.6f, 0.0f, 54.9f, 1.6f, 56.0f, 4.0f), new C47808L9q(60.0f, 12.667f, 64.0f, 21.333f, 68.0f, 30.0f), new C47808L9q(68.6f, 31.5f, 69.5f, 32.3f, 71.0f, 33.0f), new C47808L9q(79.333f, 36.667f, 87.667f, 40.333f, 96.0f, 44.0f), new C47808L9q(98.4f, 45.1f, 100.0f, 47.4f, 100.0f, 50.0f), new C47808L9q(100.0f, 52.6f, 98.4f, 54.9f, 96.0f, 56.0f), new C47808L9q(87.667f, 60.0f, 79.333f, 64.0f, 71.0f, 68.0f), new C47808L9q(69.5f, 68.6f, 68.6f, 69.5f, 68.0f, 71.0f), new C47808L9q(64.0f, 79.333f, 60.0f, 87.667f, 56.0f, 96.0f), new C47808L9q(54.9f, 98.4f, 52.6f, 100.0f, 50.0f, 100.0f), new C47808L9q(47.4f, 100.0f, 45.1f, 98.4f, 44.0f, 96.0f), new C47808L9q(40.333f, 87.667f, 36.667f, 79.333f, 33.0f, 71.0f), new C47808L9q(32.4f, 69.5f, 31.5f, 68.7f, 30.0f, 68.0f), new C47808L9q(21.333f, 64.0f, 12.667f, 60.0f, 4.0f, 56.0f), new C47808L9q(1.6f, 54.9f, 0.0f, 52.6f, 0.0f, 50.0f));
        Path A0T = AbstractC166987dD.A0T();
        A0T.moveTo(0.0f, 50.0f);
        for (C47808L9q c47808L9q : A1Q) {
            A0T.cubicTo(c47808L9q.A00, c47808L9q.A03, c47808L9q.A01, c47808L9q.A04, c47808L9q.A02, c47808L9q.A05);
        }
        A0T.close();
        A00 = A0T;
        Path A0T2 = AbstractC166987dD.A0T();
        A0T2.moveTo(0.0f, 50.0f);
        for (C47808L9q c47808L9q2 : A02) {
            A0T2.cubicTo(c47808L9q2.A00, c47808L9q2.A03, c47808L9q2.A01, c47808L9q2.A04, c47808L9q2.A02, c47808L9q2.A05);
        }
        A0T2.close();
        A03 = A0T2;
    }
}

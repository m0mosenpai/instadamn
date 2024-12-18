package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.TZx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC64922TZx extends CancellationException {
    public final SNE A00;
    public final Object A01;

    public AbstractC64922TZx(SNE sne, Object obj) {
        super("kotlin.coroutines.cancellation.CancellationException should never get swallowed. Always re-throw it if captured.This swallows the exception of Arrow's Raise, and leads to unexpected behavior.When working with Arrow prefer Either.catch or arrow.core.raise.catch to automatically rethrow CancellationException.");
        this.A01 = obj;
        this.A00 = sne;
    }
}

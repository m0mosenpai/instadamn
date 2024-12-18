package X;

import com.instagram.api.schemas.IGAIAgentType;

/* renamed from: X.CAe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27461CAe {
    public final IGAIAgentType A00() {
        if (this instanceof C26682BqP) {
            return IGAIAgentType.A04;
        }
        if (this instanceof C26683BqQ) {
            if (((C26683BqQ) this).A01) {
                return IGAIAgentType.A05;
            }
            return IGAIAgentType.A08;
        }
        throw B4Z.A00();
    }

    public final String A01() {
        if (this instanceof C26682BqP) {
            return "";
        }
        if (this instanceof C26683BqQ) {
            return ((C26683BqQ) this).A00;
        }
        throw B4Z.A00();
    }

    public final String A02() {
        if (this instanceof C26682BqP) {
            return ((C26682BqP) this).A00;
        }
        if (this instanceof C26683BqQ) {
            return "";
        }
        throw B4Z.A00();
    }

    public final String A03() {
        if (this instanceof C26682BqP) {
            return ((C26682BqP) this).A00;
        }
        if (this instanceof C26683BqQ) {
            return ((C26683BqQ) this).A00;
        }
        throw B4Z.A00();
    }
}

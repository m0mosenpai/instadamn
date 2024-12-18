package org.webrtc;

/* loaded from: classes10.dex */
public interface Predicate {

    /* renamed from: org.webrtc.Predicate$-CC, reason: invalid class name */
    /* loaded from: classes12.dex */
    public abstract /* synthetic */ class CC {
        public static Predicate $default$and(Predicate predicate, Predicate predicate2) {
            return new AnonymousClass2(predicate2);
        }

        public static Predicate $default$negate(Predicate predicate) {
            return new AnonymousClass3();
        }

        public static Predicate $default$or(Predicate predicate, Predicate predicate2) {
            return new AnonymousClass1(predicate2);
        }
    }

    /* renamed from: org.webrtc.Predicate$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    public class AnonymousClass1 implements Predicate {
        public final /* synthetic */ Predicate val$other;

        public AnonymousClass1(Predicate predicate) {
            this.val$other = predicate;
        }

        @Override // org.webrtc.Predicate
        public /* synthetic */ Predicate and(Predicate predicate) {
            return new AnonymousClass2(predicate);
        }

        @Override // org.webrtc.Predicate
        public /* synthetic */ Predicate negate() {
            return new AnonymousClass3();
        }

        @Override // org.webrtc.Predicate
        public /* synthetic */ Predicate or(Predicate predicate) {
            return new AnonymousClass1(predicate);
        }

        @Override // org.webrtc.Predicate
        public boolean test(Object obj) {
            if (!Predicate.this.test(obj) && !this.val$other.test(obj)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: org.webrtc.Predicate$2, reason: invalid class name */
    /* loaded from: classes12.dex */
    public class AnonymousClass2 implements Predicate {
        public final /* synthetic */ Predicate val$other;

        public AnonymousClass2(Predicate predicate) {
            this.val$other = predicate;
        }

        @Override // org.webrtc.Predicate
        public /* synthetic */ Predicate and(Predicate predicate) {
            return new AnonymousClass2(predicate);
        }

        @Override // org.webrtc.Predicate
        public /* synthetic */ Predicate negate() {
            return new AnonymousClass3();
        }

        @Override // org.webrtc.Predicate
        public /* synthetic */ Predicate or(Predicate predicate) {
            return new AnonymousClass1(predicate);
        }

        @Override // org.webrtc.Predicate
        public boolean test(Object obj) {
            if (Predicate.this.test(obj) && this.val$other.test(obj)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: org.webrtc.Predicate$3, reason: invalid class name */
    /* loaded from: classes12.dex */
    public class AnonymousClass3 implements Predicate {
        public AnonymousClass3() {
        }

        @Override // org.webrtc.Predicate
        public /* synthetic */ Predicate and(Predicate predicate) {
            return new AnonymousClass2(predicate);
        }

        @Override // org.webrtc.Predicate
        public /* synthetic */ Predicate negate() {
            return new AnonymousClass3();
        }

        @Override // org.webrtc.Predicate
        public /* synthetic */ Predicate or(Predicate predicate) {
            return new AnonymousClass1(predicate);
        }

        @Override // org.webrtc.Predicate
        public boolean test(Object obj) {
            return !Predicate.this.test(obj);
        }
    }

    Predicate and(Predicate predicate);

    Predicate negate();

    Predicate or(Predicate predicate);

    boolean test(Object obj);
}

package com.instagram.debug.devoptions.sandboxselector;

import X.AbstractC167017dG;
import X.C14360o3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public abstract class DevserverListError {

    /* loaded from: classes11.dex */
    public final class ConnectionError extends DevserverListError {
        public static final ConnectionError INSTANCE = new Object();
    }

    /* loaded from: classes11.dex */
    public final class HttpError extends DevserverListError {
        public final String errorMessage;
        public final int statusCode;

        public final int component1() {
            return this.statusCode;
        }

        public final String component2() {
            return this.errorMessage;
        }

        public final HttpError copy(int i, String str) {
            return new HttpError(i, str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof HttpError) {
                    HttpError httpError = (HttpError) obj;
                    if (this.statusCode != httpError.statusCode || !C14360o3.A0K(this.errorMessage, httpError.errorMessage)) {
                    }
                }
                return false;
            }
            return true;
        }

        public String toString() {
            return super.toString();
        }

        public static /* synthetic */ HttpError copy$default(HttpError httpError, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = httpError.statusCode;
            }
            if ((i2 & 2) != 0) {
                str = httpError.errorMessage;
            }
            return new HttpError(i, str);
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final int getStatusCode() {
            return this.statusCode;
        }

        public int hashCode() {
            return (this.statusCode * 31) + AbstractC167017dG.A0O(this.errorMessage);
        }

        public HttpError(int i, String str) {
            this.statusCode = i;
            this.errorMessage = str;
        }
    }

    public /* synthetic */ DevserverListError(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public DevserverListError() {
    }
}

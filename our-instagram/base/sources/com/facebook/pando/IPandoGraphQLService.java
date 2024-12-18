package com.facebook.pando;

import X.AbstractC111324zv;
import X.C14360o3;
import X.C1Df;
import X.C48O;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface IPandoGraphQLService {

    /* loaded from: classes2.dex */
    public final class Result {
        public final Token cancelToken;
        public final Object tree;

        public Result(Object obj, Token token) {
            C14360o3.A0B(token, 2);
            this.tree = obj;
            this.cancelToken = token;
        }

        public final Object component1() {
            return this.tree;
        }

        public final Token component2() {
            return this.cancelToken;
        }

        public final Result copy(Object obj, Token token) {
            C14360o3.A0B(token, 1);
            return new Result(obj, token);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Result) {
                    Result result = (Result) obj;
                    if (!C14360o3.A0K(this.tree, result.tree) || !C14360o3.A0K(this.cancelToken, result.cancelToken)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Object obj = this.tree;
            return ((obj == null ? 0 : obj.hashCode()) * 31) + this.cancelToken.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Result(tree=");
            sb.append(this.tree);
            sb.append(AbstractC111324zv.A00(3354));
            sb.append(this.cancelToken);
            sb.append(')');
            return sb.toString();
        }

        public static /* synthetic */ Result copy$default(Result result, Object obj, Token token, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = result.tree;
            }
            if ((i & 2) != 0) {
                token = result.cancelToken;
            }
            C14360o3.A0B(token, 1);
            return new Result(obj, token);
        }
    }

    /* loaded from: classes.dex */
    public interface Token extends C1Df {
    }

    Result initiate(String str, PandoGraphQLRequest pandoGraphQLRequest, C48O c48o, Executor executor);
}

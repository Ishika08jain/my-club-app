// Generated by view binder compiler. Do not edit!
package com.example.codecademy.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.codecademy.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegisterationBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText Email;

  @NonNull
  public final EditText Name;

  @NonNull
  public final EditText Number;

  @NonNull
  public final Button button3;

  @NonNull
  public final ImageView imageView5;

  @NonNull
  public final EditText pw;

  private ActivityRegisterationBinding(@NonNull ConstraintLayout rootView, @NonNull EditText Email,
      @NonNull EditText Name, @NonNull EditText Number, @NonNull Button button3,
      @NonNull ImageView imageView5, @NonNull EditText pw) {
    this.rootView = rootView;
    this.Email = Email;
    this.Name = Name;
    this.Number = Number;
    this.button3 = button3;
    this.imageView5 = imageView5;
    this.pw = pw;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisterationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisterationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_registeration, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisterationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Email;
      EditText Email = ViewBindings.findChildViewById(rootView, id);
      if (Email == null) {
        break missingId;
      }

      id = R.id.Name;
      EditText Name = ViewBindings.findChildViewById(rootView, id);
      if (Name == null) {
        break missingId;
      }

      id = R.id.Number;
      EditText Number = ViewBindings.findChildViewById(rootView, id);
      if (Number == null) {
        break missingId;
      }

      id = R.id.button3;
      Button button3 = ViewBindings.findChildViewById(rootView, id);
      if (button3 == null) {
        break missingId;
      }

      id = R.id.imageView5;
      ImageView imageView5 = ViewBindings.findChildViewById(rootView, id);
      if (imageView5 == null) {
        break missingId;
      }

      id = R.id.pw;
      EditText pw = ViewBindings.findChildViewById(rootView, id);
      if (pw == null) {
        break missingId;
      }

      return new ActivityRegisterationBinding((ConstraintLayout) rootView, Email, Name, Number,
          button3, imageView5, pw);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

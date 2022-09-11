// Generated by view binder compiler. Do not edit!
package com.example.accidenthelp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.accidenthelp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMapsBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView icGps;

  @NonNull
  public final ImageView icMagnify;

  @NonNull
  public final AutoCompleteTextView inputSearch;

  @NonNull
  public final ImageView placeInfo;

  @NonNull
  public final ImageView placePicker;

  @NonNull
  public final RelativeLayout relLayout1;

  private ActivityMapsBinding(@NonNull RelativeLayout rootView, @NonNull ImageView icGps,
      @NonNull ImageView icMagnify, @NonNull AutoCompleteTextView inputSearch,
      @NonNull ImageView placeInfo, @NonNull ImageView placePicker,
      @NonNull RelativeLayout relLayout1) {
    this.rootView = rootView;
    this.icGps = icGps;
    this.icMagnify = icMagnify;
    this.inputSearch = inputSearch;
    this.placeInfo = placeInfo;
    this.placePicker = placePicker;
    this.relLayout1 = relLayout1;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMapsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMapsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_maps, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMapsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ic_gps;
      ImageView icGps = ViewBindings.findChildViewById(rootView, id);
      if (icGps == null) {
        break missingId;
      }

      id = R.id.ic_magnify;
      ImageView icMagnify = ViewBindings.findChildViewById(rootView, id);
      if (icMagnify == null) {
        break missingId;
      }

      id = R.id.input_search;
      AutoCompleteTextView inputSearch = ViewBindings.findChildViewById(rootView, id);
      if (inputSearch == null) {
        break missingId;
      }

      id = R.id.place_info;
      ImageView placeInfo = ViewBindings.findChildViewById(rootView, id);
      if (placeInfo == null) {
        break missingId;
      }

      id = R.id.place_picker;
      ImageView placePicker = ViewBindings.findChildViewById(rootView, id);
      if (placePicker == null) {
        break missingId;
      }

      id = R.id.relLayout1;
      RelativeLayout relLayout1 = ViewBindings.findChildViewById(rootView, id);
      if (relLayout1 == null) {
        break missingId;
      }

      return new ActivityMapsBinding((RelativeLayout) rootView, icGps, icMagnify, inputSearch,
          placeInfo, placePicker, relLayout1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
